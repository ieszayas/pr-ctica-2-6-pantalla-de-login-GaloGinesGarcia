

package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class BBDD {
    public static void inicializarBaseDeDatos(Connection con) {

        String crearBaseDeDatos = "CREATE DATABASE IF NOT EXISTS pantallalogin;";
        String usarBaseDeDatos = "USE pantallalogin;";

        String crearTablaUsuario = "CREATE TABLE IF NOT EXISTS usuario ("
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

            // Crear la base de datos
            PreparedStatement pstmCrearBD = con.prepareStatement(crearBaseDeDatos);
            pstmCrearBD.executeUpdate();

            // Usar la base de datos
            PreparedStatement pstmUsarBD = con.prepareStatement(usarBaseDeDatos);
            pstmUsarBD.executeUpdate();

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
//            con.setAutoCommit(true);

        } catch (SQLException e) {
            try {
                con.rollback();
                System.out.println("Error: Transaccion no posible. Rollback.");
            } catch (SQLException ex) {
                e.getMessage();
            }
            e.getMessage();
        }
    }
}
