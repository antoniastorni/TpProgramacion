package Programa;

import ArrayLists.Administradores;
import ArrayLists.Ciudadanos;
import ArrayLists.Evento;
import ArrayLists.Juntadas;

public class sistema {
    public static void main(String[] args) {
        Ciudadanos ciudadanos = new Ciudadanos();
        Administradores administradores = new Administradores();
        Evento eventos = new Evento();
        Juntadas juntadas = new Juntadas();
        FileManagement.generateCiudadanos(ciudadanos);
        FileManagement.generateAdministradores(administradores);
        FileManagement.generateEventos(eventos);
        FileManagement.generateJuntadas(juntadas);
        Inicio.menuInicial(ciudadanos, administradores, eventos, juntadas);

    }






}
