package Programa;

import ArrayLists.*;
import Constructores.Administrador;
import Constructores.Ciudadano;
import Programa.FileManagement;

public class Menus {
    public static void menuCiudadanos(Ciudadano a, Ciudadanos ciudadanos, Evento eventos, Juntadas juntadas, Brotes brotes, NotificacionesTotales notificaciones){
        //Inicia el menu de ciudadanos con sus opciones
        if (a.bloqueado >= 5){
            System.out.println("Usted esta bloqueado");
            System.exit(0);
        }
        Social.solicitudes(a, juntadas, ciudadanos, brotes);
        Social.notificacion(a, notificaciones);
        while(true){
            System.out.println("1 Reportar sintomas\n2 Remover sintoma\n3 Reportar juntada reciente\n4 Sintomas comunes de tu zona\n5 Salir");
            int b = Scanner.getInt("Seleccione el numero de su respuesta: ");
            switch (b) {
                case 1:
                    eventos.print();
                    Integer i = Scanner.getInt("seleccione el sintoma: ");
                    a.agregar(eventos, i);
                    if (a.sintomas.size() >= 2){
                        System.out.println("!usted tiene covid¡");
                    }if (a.sintomas.size() == 2){
                        a.covid(juntadas, ciudadanos, brotes, notificaciones);
                    }
                    break;
                case 2:
                    for (int j = 0; j < a.sintomas.size(); j++){
                        System.out.println(j + " " + a.sintomas.get(j));
                    }
                    int remove = Scanner.getInt("seleccione el sintoma: ");
                    a.remove(remove);
                    if (a.sintomas.size() <= 1){
                        System.out.println("usted no tiene covid");
                        a.covid(juntadas, ciudadanos, brotes, notificaciones);
                    }
                    break;
                case 3:
                    Double Telefono = Scanner.getDouble("Ingrese el Telefono de la persona con la que se junto: ");
                    Integer diaDesde = Scanner.getInt("desde que dia?: ");
                    Integer mesDesde = Scanner.getInt("que mes? (Ingrese numero): ");
                    Integer diaHasta = Scanner.getInt("Hasta que dia? (Ingrese Dia/Mes/Año): ");
                    Integer mesHasta = Scanner.getInt("que mes? (Ingrese numero): ");
                    String juntadaDesde = diaDesde + "/" + mesDesde;
                    String juntadaHasta = diaHasta + "/" + mesHasta;
                    a.juntada(ciudadanos, juntadaDesde, juntadaHasta, Telefono);
                    FileManagement.generateJuntadas(juntadas);
                    break;
                case 4:
                    EventosZona.EventosRanking(ciudadanos, a.zona);
                    break;
                case 5:
                    FileManagement.writeJuntadas(juntadas);
                    FileManagement.writeCiudadanos(ciudadanos);
                    FileManagement.writeBrotes(brotes);
                    FileManagement.writeNotificaciones(notificaciones);
                    System.exit(0);
                default:
                    System.out.println("Ingrese un valor existente");
                    break;
            }
        }
    }
    public static void menuAdministradores(Administrador a, Ciudadanos ciudadanos, Evento eventos, Administradores administradores){
        // menu de administradores
        while(true){
            System.out.println("1 transformar ciudadano en administrador\n2 desbloquear ciudadano \n3 Agregar evento\n4 Remover evento\n5 Salir");
            int b = Scanner.getInt("Seleccione el numero de su respuesta: ");
            switch (b){
                case 1:
                    Double cuil1 = Scanner.getDouble("Ingrese el cuil de el ciudadano: ");
                    a.transAdmin(cuil1, ciudadanos, administradores);
                    break;
                case 2:
                    for (int i = 0; i < ciudadanos.size(); i++) {
                        if (ciudadanos.get(i).bloqueado >= 5){
                            System.out.println("Cuil: " + ciudadanos.get(i).CUIL + ", Telefono:" + ciudadanos.get(i).telefono + ", Zona: " + ciudadanos.get(i).zona);
                        }
                    }
                    Double cuil2 = Scanner.getDouble("Ingrese el cuil de el ciudadano: ");
                    a.desblock(cuil2, ciudadanos);
                    break;
                case 3:
                    String evento1 = Scanner.getString("Que sintoma desea agregar: ");
                    a.addEvent(eventos, evento1);
                    break;
                case 4:
                    String evento2 = Scanner.getString("Que sintoma desea eliminar: ");
                    a.removeEvent(eventos, evento2);
                    break;
                case 5:
                    FileManagement.writeEventos(eventos);
                    FileManagement.writeCiudadanos(ciudadanos);
                    FileManagement.writeAdministrador(administradores);
                    System.exit(0);
                default:
                    System.out.println("Ingrese un valor existente");
                    break;
            }
        }
    }
}
