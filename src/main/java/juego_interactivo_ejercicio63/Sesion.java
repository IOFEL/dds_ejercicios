package juego_interactivo_ejercicio63;

import juego_interactivo_ejercicio63.exceptiones.PersonajeDesconocido;

public class Sesion {

    private Personaje personaje;
    private Juego juego;

    public void seleccionar_personaje(Personaje personaje) throws PersonajeDesconocido {
        juego.seleccionar_personaje(this,personaje);
    }

}
