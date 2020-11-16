package Programa;

import ArrayLists.Brotes;
import ArrayLists.Ciudadanos;
import ArrayLists.Juntadas;
import ArrayLists.NotificacionesTotales;
import Constructores.Ciudadano;
import java.util.Calendar;

public class Social {
    public static void solicitudes(Ciudadano a, Juntadas juntadas, Ciudadanos ciudadanos, NotificacionesTotales notificaciones){
        for (int i = 0; i < juntadas.size(); i++) {
            if (a.getTelefono().equals(juntadas.get(i).getTelefono()) && juntadas.get(i).getVisto().equals(false)){
                System.out.println("Usted se ha juntado con la persona " + juntadas.get(i).getMiTelefono() + " A partir del dia " + juntadas.get(i).getFechaDesde() + " hasta el " + juntadas.get(i).getFechaHasta() + "?");
                System.out.println("1 Si\n2 no");
                Integer confirm = Scanner.getInt("Ingrese el numero de su respuesta: ");
                switch (confirm){
                    case 1:
                        juntadas.get(i).confirmado = true;
                        juntadas.get(i).visto = true;
                        for (int j = 0; j < ciudadanos.size(); j++) {
                            if(juntadas.get(i).getMiTelefono().equals(ciudadanos.get(j).getTelefono())){
                                if (ciudadanos.get(j).coronavirus.equals(true)){
                                    ciudadanos.get(i).advetir(a, notificaciones);
                                }if (a.coronavirus.equals(true)){
                                    a.advetir(ciudadanos.get(i), notificaciones);
                                }
                            }
                        }
                        break;
                    case 2:
                        for (int j = 0; j < ciudadanos.size(); j++) {
                            if(juntadas.get(i).getMiTelefono().equals(ciudadanos.get(j).getTelefono())){
                                ciudadanos.get(j).bloqueado += 1;
                            }
                        }
                        juntadas.get(i).visto = true;
                        break;
                    default:
                        System.out.println("Valor no existente");
                        break;
                }
            }
        }
    }

    public static void notificacion(Ciudadano ciudadano, NotificacionesTotales notificaciones){
        Calendar calendar = Calendar.getInstance();
        Integer dia = calendar.get(Calendar.DATE);
        Integer mes = calendar.get(Calendar.MONTH) + 1;
        String line;
        for (int i = 0; i < notificaciones.size(); i++) {
            if (ciudadano.CUIL.equals(notificaciones.get(i).getCuilAdvertir())){
                if (dia <= notificaciones.get(i).getDiaHasta()){
                    System.out.println("El ciudadano " + notificaciones.get(i).getCuilcovid() + " con el que se junto tuvo coronavirus.");
                }if (dia > notificaciones.get(i).getDiaHasta() && mes < notificaciones.get(i).getMesHasta()){
                    System.out.println("El ciudadano " + notificaciones.get(i).getCuilcovid() + " con el que se junto tuvo coronavirus.");
                }else{

                }
            }
        }
    }
}
