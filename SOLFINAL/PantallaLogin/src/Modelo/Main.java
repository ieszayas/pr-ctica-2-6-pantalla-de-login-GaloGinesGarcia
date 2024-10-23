package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean recorrerUsuarios(String nombreLoguer, String passwordLoguer) {

        boolean encontrado = false;

        ArrayList<Usuario> listaUsuarios = new ArrayList();
        listaUsuarios.add(new Usuario("Galo", "1234"));
        listaUsuarios.add(new Usuario("Victor", "12345"));

        for (Usuario listaUsuario : listaUsuarios) {

            if (nombreLoguer.equals(listaUsuario.getNombre()) && passwordLoguer.equals(listaUsuario.getPassword())) {
                encontrado = true;
            }

        }

        return encontrado;
    }

    public static ArrayList<Usuario> cargarUsuarios(Connection con) {

        String query = "SELECT * FROM usuario;";
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        try {

            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);

            //jugadores.clear(); // Limpiar la lista para evitar duplicados
            while (rs.next()) {

                String nombre = rs.getString("nombre");
                String contrasenia = rs.getString("contrasenia");

                Usuario usuario = new Usuario(nombre, contrasenia);
                usuarios.add(usuario);

            }
            System.out.println("Jugadores cargados desde la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }

    public boolean crearUsuario(Usuario u, Connection con) {
        PreparedStatement pstm = null;

        try {

            String query = "INSERT INTO usuario (nombre, contrasenia) VALUES (?, ?)";
            pstm = con.prepareStatement(query);
            pstm.setString(1, u.getNombre());
            pstm.setString(2, u.getPassword());

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
