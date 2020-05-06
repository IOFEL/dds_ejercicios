package juego_interactivo_ejercicio63;

import java.awt.*;

public class Personaje {

    private String nombre;
    private Image imagen;
    private double altura;
    private double peso;
    private double inteligencia;
    private double habiliodad;

    /*
    * Metodos de la clase comunes a los personajes
    * */

    public boolean mismo_estado_inicial(Personaje personaje){
        return true; //sobreescribir el metodo testeando que no sea igual en atributos
    }

    public Personaje clonar(){
        //Devuelve un personaje nuevo con los mismos atributos
        return null;
    }
}
