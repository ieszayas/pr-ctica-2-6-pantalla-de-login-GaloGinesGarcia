package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

public class SingleConexion {
    private static Connection con = null;

    private SingleConexion() { }

    public static Connection getConnection() {
        if (con == null) {
            Properties properties = new Properties();
            // Usar getResourceAsStream para cargar config.properties desde el classpath
            try (InputStream input = SingleConexion.class.getResourceAsStream("/Modelo/config.properties")) {
                if (input == null) {
                    System.out.println("No se encontró el archivo config.properties");
                    return null;
                }
                
                // Cargar propiedades desde el archivo config.properties
                properties.load(input);

                // Leer cada propiedad necesaria para la conexión
                String url = properties.getProperty("db.url"); // URL base sin la base de datos
//                String dbName = properties.getProperty("db.name"); // Nombre de la base de datos
                String user = properties.getProperty("db.user");
                String password = properties.getProperty("db.password");

                // Concatenar el nombre de la base de datos en la URL
                String fullUrl = url;

                // Crear la conexión a la base de datos
                con = DriverManager.getConnection(fullUrl, user, password);

                if (con != null) {
                    System.out.println("CONECTADO");
                } else {
                    System.out.println("ERROR AL CONECTARSE");
                }
            } catch (IOException ex) {
                System.err.println("Error al leer el archivo config.properties: " + ex.getMessage());
            } catch (SQLException ex) {
                System.err.println("Error al conectar con la base de datos: " + ex.getMessage());
            }
        }
        return con;
    }

    public static void closeConnection() {
        try {
            if (con != null) {
                System.out.println("Cerrando conexión");
                con.close();
                con = null;
            }
        } catch (SQLException ex) {
            System.err.println("Error al cerrar la conexión: " + ex.getMessage());
        }
    }
}