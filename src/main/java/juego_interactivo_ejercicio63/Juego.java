package juego_interactivo_ejercicio63;

import juego_interactivo_ejercicio63.exceptiones.PersonajeDesconocido;
import juego_interactivo_ejercicio63.exceptiones.PersonajeRepetido;

import java.util.List;
import java.util.Map;

public class Juego {

    private List<Personaje> catalogo;

    private Map<Sesion, Personaje> sesiones;

    public void nuevo_personaje(Personaje personaje) throws PersonajeRepetido {
        if (esta_en_catalogo(personaje)) throw new PersonajeRepetido();
        catalogo.add(personaje);
    }

    public boolean esta_en_catalogo(Personaje personaje){
        return true; // iterar el catalogo con mismo_estado_inicial
    }

    public void seleccionar_personaje(Sesion sesion,Personaje personaje) throws PersonajeDesconocido {
        if (!esta_en_catalogo(personaje)) throw new PersonajeDesconocido();
        sesiones.put(sesion,personaje.clonar());
    }



}
