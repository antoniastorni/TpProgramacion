package Programa;

import ArrayLists.Ciudadanos;
import ArrayLists.Juntadas;
import Constructores.Ciudadano;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

public class Social {
    public static void solicitudes(Ciudadano a, Juntadas juntadas, Ciudadanos ciudadanos){
        for (int i = 0; i < juntadas.size(); i++) {
            if (a.getTelefono().equals(juntadas.get(i).getTelefono()) && juntadas.get(i).getVisto().equals(false)){
                System.out.println("Usted se ha juntado con la persona " + juntadas.get(i).getMiTelefono() + " A partir del dia " + juntadas.get(i).getFechaDesde() + " hasta el " + juntadas.get(i).getFechaHasta() + "?");
                System.out.println("1 Si\n2 no");
                Integer confirm = Scanner.getInt("Ingrese el numero de su respuesta: ");
                switch (confirm){
                    case 1:
                        juntadas.get(i).confirmado = true;
                        juntadas.get(i).visto = true;
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

    public static void notificacion(Ciudadano ciudadano){
        Calendar calendar = Calendar.getInstance();
        Integer dia = calendar.get(Calendar.DATE);
        Integer mes = calendar.get(Calendar.MONTH) + 1;
        String line;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\Anses\\Notificar.txt"));){
            while ((line = bufferedReader.readLine()) != null) {
                String[] adv = line.split(",");
                if (ciudadano.CUIL.equals(Double.parseDouble(adv[1]))){
                    if (dia <= Integer.parseInt(adv[4])){
                        System.out.println("El ciudadano " + adv[0] + " con el que se junto tiene coronavirus");
                    }if (dia > Integer.parseInt(adv[4]) && mes < Integer.parseInt(adv[5])){
                        System.out.println("El ciudadano " + adv[0] + " con el que se junto tiene coronavirus");
                    }else{

                    }
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
