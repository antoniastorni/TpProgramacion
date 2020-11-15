package Programa;

import ArrayLists.*;

public class sistema {
    public static void main(String[] args) {
        Ciudadanos ciudadanos = new Ciudadanos();
        Administradores administradores = new Administradores();
        Evento eventos = new Evento();
        Juntadas juntadas = new Juntadas();
        Brotes brotes = new Brotes();
        FileManagement.generateCiudadanos(ciudadanos);
        FileManagement.generateAdministradores(administradores);
        FileManagement.generateEventos(eventos);
        FileManagement.generateJuntadas(juntadas);
        FileManagement.generateBrotes(brotes);
        Inicio.menuInicial(ciudadanos, administradores, eventos, juntadas, brotes);

    }






}
