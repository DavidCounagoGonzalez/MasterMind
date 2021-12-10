package com.david;

public class MasterMind {
    private int intentos;

    public static void main(String[] args) {
    Tablero tablero= Tablero.getInstance();
    Funciones.generarAleatorio(tablero);

    for (int i=0;i<10;i++){
        Funciones.pedirSecuencia(tablero);
        if(Funciones.compararSecuencia(tablero.getCifraAleatoria(),tablero.getCifraSecuencia())){
            Funciones.mostrar("Ganaste");
            break;
        }
        else{
            Funciones.mostrarPista(tablero.getCifraPista());
        }
    }
    Funciones.mostrar("Se acabó.");
    }
}
