package Modelo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        

    }

    public static boolean recorrerUsuarios(String nombreLoguer, String passwordLoguer) {

        boolean encontrado = false;

        ArrayList<Usuario> listaUsuarios = new ArrayList();
        listaUsuarios.add(new Usuario("Galo", "1234"));
        listaUsuarios.add(new Usuario("Victor", "1234"));
        listaUsuarios.add(new Usuario("Mike", "1234"));

        for (Usuario listaUsuario : listaUsuarios) {

            if (nombreLoguer.equals(listaUsuario.getNombre()) && passwordLoguer.equals(listaUsuario.getPassword())) {
                encontrado = true;
            }

        }

        return encontrado;
    }

}
