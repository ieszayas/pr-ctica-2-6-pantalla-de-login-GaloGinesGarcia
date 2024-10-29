package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class OperativasBBDD {

    public static void main(String[] args) {

    }
    
    public static boolean iniciarUsuario(String nombre, String password, Connection con) {
    PreparedStatement pstm = null;
    ResultSet rs = null;

    try {
        String query = "SELECT * FROM usuario WHERE nombre = ? AND password = ?;";
        pstm = con.prepareStatement(query);
        pstm.setString(1, nombre);
        pstm.setString(2, password);

        rs = pstm.executeQuery();

        
        return rs.next(); 
        

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    } 
}

    public static ArrayList<Usuario> cargarUsuarios(Connection con) {

        String query = "SELECT * FROM usuario;";
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        try {

            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);

            
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String fechaNac = rs.getString("fechaNac");
                String correoE = rs.getString("correoE");
                String password = rs.getString("password");
                

                Usuario usuario = new Usuario(id, nombre, apellido, fechaNac, correoE, password);
                usuarios.add(usuario);

            }
            System.out.println("Usuarios cargados desde la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }

    public static boolean crearUsuario(String nombre, String apellido, String fechaNac, String correoE, String password, Connection con) {
        PreparedStatement pstm = null;

        try {

            String query = "INSERT INTO usuario (nombre, apellido, fechaNac, correoE, password) VALUES (?, ?, ?, ?, ?)";
            pstm = con.prepareStatement(query);
            pstm.setString(1, nombre);
            pstm.setString(2, apellido);
            pstm.setString(3, fechaNac);
            pstm.setString(4, correoE);
            pstm.setString(5, password);
            
            

            pstm.executeUpdate();

            return true;

        } catch (SQLException e) {
            e.getMessage();
            return false;

        }

    }
    
    public static boolean leerUsuarios(int id, Connection con) {
    boolean encontrado = false; // Inicializamos como false
    
    try {
        String query = "SELECT id FROM usuario WHERE id = ?;";
        PreparedStatement pstm = con.prepareStatement(query);
        pstm.setInt(1, id);
        ResultSet rs = pstm.executeQuery();

        // Verificamos si hay resultados
        if (rs.next()) { // Solo necesitamos verificar una vez si hay un resultado
            System.out.println("Usuario encontrado: ID = " + rs.getInt("id"));
            encontrado = true; // Marcamos como encontrado
        } else {
            System.out.println("No se encontró un usuario con ID = " + id);
        }
        
    } catch (SQLException e) {
        System.err.println("Error en la consulta: " + e.getMessage());
    }
    
    return encontrado; // Retornamos el resultado
}

    public static boolean modificarUsuario(String nombre, String password, Connection con) {
        try {
            // Consulta SQL corregida
            String query = "UPDATE usuario SET password = ? WHERE nombre = ?";

            // Preparar la sentencia SQL
            PreparedStatement pstm = con.prepareStatement(query);

            // Asignar valores a los placeholders
            pstm.setString(1, password);
            pstm.setString(2, nombre);

            // Ejecutar la actualización
            pstm.executeUpdate();
            
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Usuario no existe");
            return false;
        }
    }

}
