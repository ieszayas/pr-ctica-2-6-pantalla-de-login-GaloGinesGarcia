 HEAD



 SegundaParte
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BBDD {

    public static void inicializarBaseDeDatos(Connection con) {
        String crearBaseDeDatos = "CREATE DATABASE IF NOT EXISTS pantallalogin;";
        String usarBaseDeDatos = "USE pantallalogin;";

        String crearTablaUsuario = "CREATE TABLE IF NOT EXISTS usuario ("
 HEAD
                + "nombre VARCHAR(20),"
                + "contrasenia VARCHAR(20) PRIMARY KEY"
                + ");";

        

        String insertarUsuarios = "INSERT IGNORE INTO usuario (nombre, contrasenia) VALUES "
                + "('Galo', '1234'),"
                + "('Victor', '12345')"
                + ");";

        

        try {
            //Forzarlo a false puesto que por defecto esta en true (autocommit)
            con.setAutoCommit(false);


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
 SegundaParte
            // Crear la base de datos
            PreparedStatement pstmCrearBD = con.prepareStatement(crearBaseDeDatos);
            pstmCrearBD.executeUpdate();

            // Usar la base de datos
            PreparedStatement pstmUsarBD = con.prepareStatement(usarBaseDeDatos);
            pstmUsarBD.executeUpdate();

 HEAD
            // Crear las tablas
            PreparedStatement pstmcrearTablaUsuario = con.prepareStatement(crearTablaUsuario);
            
            pstmcrearTablaUsuario.executeUpdate();
            

            

            // Ahora, activar transacción manual
            con.setAutoCommit(false);

            // Crear las tablas
            PreparedStatement pstmcrearTablaUsuario = con.prepareStatement(crearTablaUsuario);
            pstmcrearTablaUsuario.executeUpdate();
 SegundaParte

            // Insertar usuarios
            PreparedStatement pstminsertarUsuarios = con.prepareStatement(insertarUsuarios);
            pstminsertarUsuarios.executeUpdate();

 HEAD
            

 SegundaParte
            // Confirmar la transacción
            con.commit();
            System.out.println("Base de datos, tablas y datos iniciales creados con exito.");
            //Poner el autocomit nuevamente a true
 HEAD
//            con.setAutoCommit(true);

            con.setAutoCommit(true);
 SegundaParte

        } catch (SQLException e) {
            try {
                con.rollback();
 HEAD
                System.out.println("Error: Transaccion no posible. Rollback.");
            } catch (SQLException ex) {
                e.getMessage();
            }
            e.getMessage();

                System.out.println("Error: Transacción no posible. Rollback.");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
 SegundaParte
        }
    }
}
