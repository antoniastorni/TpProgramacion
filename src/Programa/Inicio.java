package Programa;

import ArrayLists.*;
import Constructores.Ciudadano;

public class Inicio {
    public static void menuInicial(Ciudadanos ciudadanos, Administradores administradores, Evento eventos, Juntadas juntadas, Brotes brotes, NotificacionesTotales notificaciones){
        while(true){
            System.out.println("1 Iniciar sesion\n2 Crear cuenta");
            int b = Scanner.getInt("Seleccione el numero de su respuesta: ");
            switch (b) {
                case 1:
                    Double cuil = Scanner.getDouble("Ingrese su CUIL: ");
                    Double telefono = Scanner.getDouble("Ingrese su Telefono: ");
                    buscarUsuario(cuil, telefono, ciudadanos, administradores, eventos, juntadas, brotes, notificaciones);
                    System.exit(0);
                    break;
                case 2:
                    crearCuenta(ciudadanos, eventos, juntadas, brotes, notificaciones);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese un valor existente");
                    break;
            }
        }
    }
    public static void crearCuenta(Ciudadanos ciudadanos, Evento eventos, Juntadas juntadas, Brotes brotes, NotificacionesTotales notificaciones){
        Double cuil = Scanner.getDouble("Ingrese su cuil: ");
        Double telefono = Scanner.getDouble("Ingrese su numero de telefono: ");
        String zona = Scanner.getString("Ingrese su zona: ");
        Ciudadano ciudadano = new Ciudadano(cuil, telefono, zona);
        ciudadanos.add(ciudadano);
        Menus.menuCiudadanos(ciudadano, ciudadanos, eventos, juntadas, brotes, notificaciones);
    }
    public static void buscarUsuario(Double cuil, Double telefono, Ciudadanos ciudadanos, Administradores administradores, Evento eventos, Juntadas juntadas, Brotes brotes, NotificacionesTotales notificaciones){
        for (int i = 0;  i < ciudadanos.size(); i++){
            if(cuil.equals(ciudadanos.get(i).getCUIL()) && telefono.equals(ciudadanos.get(i).getTelefono())){
                Menus.menuCiudadanos(ciudadanos.get(i), ciudadanos, eventos, juntadas, brotes, notificaciones);
            }
        }
        for (int i = 0;  i < administradores.size(); i++){
            if(cuil.equals(administradores.get(i).getCUIL()) && telefono.equals(administradores.get(i).getTelefono())){
                Menus.menuAdministradores(administradores.get(i), ciudadanos, eventos, administradores);
            }
        }
        System.out.println("Usuario no encontrado");
        menuInicial(ciudadanos, administradores, eventos, juntadas, brotes, notificaciones);
    }
}
