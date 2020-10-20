import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class sistema {
    public static void main(String[] args) {
        Ciudadanos ciudadanos = new Ciudadanos();
        Administradores administradores = new Administradores();
        Evento eventos = new Evento();
        FileManagement.generateCiudadanos(ciudadanos);
        FileManagement.generateAdministradores(administradores);
        FileManagement.generateEventos(eventos);
        Inicio.menuInicial(ciudadanos, administradores, eventos);

    }






}
