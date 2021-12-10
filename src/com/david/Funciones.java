package com.david;

public class Funciones {
    public static boolean generarAleatorio(Tablero auxTablero) {
        auxTablero.setCifraAleatoria("5432");
        return true;
    }

    public static String pedirSecuencia(Tablero cifraSecuencia) {
        cifraSecuencia.setCifraSecuencia("5436");
        //Pedir secuencia al jugador
        return null;
    }

    public static boolean compararSecuencia(String cifraAleatoria, String cifraSecuencia) {

        //comparar
        cifraAleatoria.equals(cifraSecuencia);

        return false;
    }

    public static void mostrar(String mensaje) {

    }

    public static String mostrarPista(Tablero tablero) {



        return null;
    }
}
