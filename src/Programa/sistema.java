package Programa;

import ArrayLists.*;

public class sistema {
    public static void main(String[] args) {
        Ciudadanos ciudadanos = new Ciudadanos();
        Administradores administradores = new Administradores();
        Evento eventos = new Evento();
        Juntadas juntadas = new Juntadas();
        Brotes brotes = new Brotes();
        NotificacionesTotales notificaciones = new NotificacionesTotales();
        FileManagement.generateCiudadanos(ciudadanos);
        FileManagement.generateAdministradores(administradores);
        FileManagement.generateEventos(eventos);
        FileManagement.generateJuntadas(juntadas);
        FileManagement.generateBrotes(brotes);
        FileManagement.generateNotificaciones(notificaciones);
        Inicio.menuInicial(ciudadanos, administradores, eventos, juntadas, brotes, notificaciones);

    }






}
