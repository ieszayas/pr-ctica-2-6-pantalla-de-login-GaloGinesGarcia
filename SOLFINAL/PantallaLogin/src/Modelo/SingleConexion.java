

package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SingleConexion {
    private static Connection con = null;

    private SingleConexion() {

    }

    public static Connection getConnection() {

        String cadena_conexion = "jdbc:mysql://localhost:3306/"; //hay que incluir simepre esto: jdbc:mysql://localhost:3306/ para la conexion
 HEAD
       // String nombre_BBDD = "torneo_cara_cruz";//nombre de la base de datos. Debemos añadir el mismo nombre de la base de datos creada

        String nombre_BBDD = "pantallalogin";//nombre de la base de datos. Debemos añadir el mismo nombre de la base de datos creada
 SegundaParte
        String usuario = "admin";//Nombre del usuario en la base de datos. Mismo usuario de la base de datos creada
        String contrasenia = "1234";//Contraseña del usuario de la base de datos. Misma contraseña de la base de datos creada.
        try {
            //Se tiene que utilizar siempre la clase: DriverManager.getConnection(cadena_conexion + nombre_BBDD, usuario, contrasenia);
            //De esta manera la conexion "con" recive el puerto de conexion, el noombre de la abse de datos, el usuario y contraseña de la base de datos.
 HEAD
            con = DriverManager.getConnection(cadena_conexion, usuario, contrasenia);

            con = DriverManager.getConnection(cadena_conexion + nombre_BBDD, usuario, contrasenia);
 SegundaParte
            //Si con es distinto de null, se ha conetado
            if (con != null) {
                System.out.println("CONECTADO");

            } //De lo contrario, no se ha conectado.
            else {
                System.out.println("ERROR AL CONECTARSE");
            }
        } catch (Exception ex) {
//            Logger.getLogger(ConectorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

        return con;

    }

    public static Connection closeConnection() {
        try {
            //Si es distinto de null, se ha cerrado la conexion
            if (con != null) {
                System.out.println("Cerrando conexion");
                //Se cierra la conexion
                con.close();

            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return con;
    }
}
