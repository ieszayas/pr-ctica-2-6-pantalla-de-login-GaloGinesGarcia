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

//    public static boolean recorrerUsuarios(ArrayList <Usuario> usuarios = new ArrayList()) {
//
//        boolean encontrado = false;
//
//        ArrayList<Usuario> listaUsuarios = new ArrayList();
//        listaUsuarios.add(new Usuario("Galo", "1234"));
//        listaUsuarios.add(new Usuario("Victor", "12345"));
//
//        for (Usuario listaUsuario : listaUsuarios) {
//
//            if (nombreLoguer.equals(listaUsuario.getNombre()) && passwordLoguer.equals(listaUsuario.getPassword())) {
//                encontrado = true;
//            }
//
//        }
//
//        return encontrado;
//    }
    
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
            System.out.println("Jugadores cargados desde la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }

    public static boolean crearUsuario(int id, String nombre, String apellido, String fechaNac, String correoE, String password, Connection con) {
        PreparedStatement pstm = null;

        try {

            String query = "INSERT INTO usuario (id, nombre, apellido, fechaNac, correoE, password) VALUES (?, ?, ?, ?, ?, ?)";
            pstm = con.prepareStatement(query);
            pstm.setInt(1, id);
            pstm.setString(2, nombre);
            pstm.setString(3, apellido);
            pstm.setString(4, fechaNac);
            pstm.setString(5, correoE);
            pstm.setString(6, password);
            

            pstm.executeUpdate();

            return true;

        } catch (SQLException e) {
            e.getMessage();
            return false;

        }

    }

    public boolean modificarUsuario(Usuario u, Connection con) {
        try {
            // Consulta SQL corregida
            String query = "UPDATE usuario SET contrasenia = ? WHERE nombre = ?";

            // Preparar la sentencia SQL
            PreparedStatement pstm = con.prepareStatement(query);

            // Asignar valores a los placeholders
            pstm.setString(1, u.getPassword());
            pstm.setString(2, u.getNombre());

            // Ejecutar la actualización
            pstm.executeUpdate();

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
