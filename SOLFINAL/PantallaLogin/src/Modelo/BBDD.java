package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BBDD {

    public static void inicializarBaseDeDatos(Connection con) {
        String crearBaseDeDatos = "CREATE DATABASE IF NOT EXISTS pantallalogin;";
        String usarBaseDeDatos = "USE pantallalogin;";

        String crearTablaUsuario = "CREATE TABLE IF NOT EXISTS usuario ("
                + "id INT(10) PRIMARY KEY,"
                + "nombre VARCHAR(20),"
                + "apellido VARCHAR(20),"
                + "fechaNac VARCHAR(20),"
                + "correoE VARCHAR(40),"
                + "password VARCHAR(20)"
                + ");";

        String insertarUsuarios = "INSERT IGNORE INTO usuario (id, nombre, apellido, fechaNac, correoE, password) VALUES "
                + "(1, 'Galo', 'Gines', '10/09/2001', 'galogines1@gmail.com', '1234'),"
                + "(2, 'Victor', 'Viti', '10/10/2003', 'victorviti@gmail.com', '12345');";

        try {
            // No se usa transacción aquí
            // Crear la base de datos
            PreparedStatement pstmCrearBD = con.prepareStatement(crearBaseDeDatos);
            pstmCrearBD.executeUpdate();

            // Usar la base de datos
            PreparedStatement pstmUsarBD = con.prepareStatement(usarBaseDeDatos);
            pstmUsarBD.executeUpdate();

            // Ahora, activar transacción manual
            con.setAutoCommit(false);

            // Crear las tablas
            PreparedStatement pstmcrearTablaUsuario = con.prepareStatement(crearTablaUsuario);
            pstmcrearTablaUsuario.executeUpdate();

            // Insertar usuarios
            PreparedStatement pstminsertarUsuarios = con.prepareStatement(insertarUsuarios);
            pstminsertarUsuarios.executeUpdate();

            // Confirmar la transacción
            con.commit();
            System.out.println("Base de datos, tablas y datos iniciales creados con exito.");
            //Poner el autocomit nuevamente a true
            con.setAutoCommit(true);

        } catch (SQLException e) {
            try {
                con.rollback();
                System.out.println("Error: Transacción no posible. Rollback.");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
