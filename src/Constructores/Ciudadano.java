package Constructores;
import ArrayLists.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

public class Ciudadano {
    public Double CUIL;
    public Double telefono;
    public String zona;
    public Integer bloqueado;
    public ArrayList<String> sintomas;
    public Boolean coronavirus;

    public Ciudadano(Double CUIL, Double telefono, String zona){// Constructor utilizado al crear nuevea cuenta
        this.CUIL = CUIL;
        this.telefono = telefono;
        this.zona = zona;
        this.bloqueado = 0;
        this.sintomas = new ArrayList<>();
        this.coronavirus = false;
    }

    public Ciudadano(Double CUIL, Double telefono, String zona, Integer bloqueado, Boolean coronavirus){// Constructor utilizado para cuentas ya existentes
        this.CUIL = CUIL;
        this.telefono = telefono;
        this.zona = zona;
        this.bloqueado = bloqueado;
        this.sintomas = new ArrayList<>();
        this.coronavirus = coronavirus;
    }

    public Double getCUIL() {
        return CUIL;
    }

    public Double getTelefono() {
        return telefono;
    }

    public String getZona() {
        return zona;
    }

    public Integer getBloqueado(){
        return bloqueado;
    }

    public Boolean getCoronavirus(){
        return coronavirus;
    }

    public void agregar(Evento evento, Integer a){//Agrega un sintoma de la lista de eventos a la de el Constructores.Ciudadano
        if (sintomas.contains(evento.get(a))){
            System.out.println("Usted ya reporto este sintoma");
        }else{
            sintomas.add(evento.get(a));
        }
    }
    public void covid(Juntadas juntadas, Ciudadanos ciudadanos, Brotes brotes, NotificacionesTotales notificaciones){// Si el size de la lista de sintomas del ciudadano es mayor o igual a 2, el ciudadano tiene covid
        if (sintomas.size() >= 2){
            coronavirus = true;
            Calendar calendar = Calendar.getInstance();
            Integer dia = calendar.get(Calendar.DATE);
            Integer mes = calendar.get(Calendar.MONTH) + 1;
            for (int i = 0; i < juntadas.size(); i++) {
                if (telefono.equals(juntadas.get(i).getMiTelefono())){
                    for (int j = 0; j < ciudadanos.size(); j++) {
                        if (ciudadanos.get(j).telefono.equals(juntadas.get(i).getTelefono())){
                            advetir(ciudadanos.get(j), notificaciones);
                            if (ciudadanos.get(j).coronavirus.equals(true) && zona.equals(ciudadanos.get(j).getZona())){
                                for (int k = 0; k < brotes.sizeArrays(); k++) {
                                    if (brotes.get(k, brotes.sizeArray(k)-3).equals(ciudadanos.get(j).getCUIL()) && brotes.get(k, 1)+2 >= dia){
                                        brotes.add(k, CUIL, dia.doubleValue(), mes.doubleValue());
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }if (telefono.equals(juntadas.get(i).getTelefono())){
                    for (int j = 0; j < ciudadanos.size(); j++) {
                        if (ciudadanos.get(j).telefono.equals(juntadas.get(i).getMiTelefono())){
                            advetir(ciudadanos.get(j), notificaciones);
                            if (ciudadanos.get(j).coronavirus.equals(true) && zona.equals(ciudadanos.get(j).getZona())){
                                for (int k = 0; k < brotes.sizeArrays(); k++) {
                                    if (brotes.get(k, brotes.sizeArray(k)-3).equals(ciudadanos.get(j).getCUIL()) && brotes.get(k, 1)+2 >= dia){
                                        brotes.add(k, CUIL, dia.doubleValue(), mes.doubleValue());
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            brotes.addNew(CUIL, dia.doubleValue(), mes.doubleValue());
        }else{
            coronavirus = false;
        }
    }
    public void advetir(Ciudadano ciudadano, NotificacionesTotales notificaciones){
        Calendar calendar = Calendar.getInstance();
        Integer diaDesde = calendar.get(Calendar.DATE);
        Integer mesDesde = calendar.get(Calendar.MONTH) + 1;
        calendar.add((Calendar.DATE), 2);
        Integer diaHasta = calendar.get(Calendar.DATE);
        Integer mesHasta;
        if (diaHasta < diaDesde){
            mesHasta = calendar.get(Calendar.MONTH) + 2;
        }else{
            mesHasta = calendar.get(Calendar.MONTH) + 1;
        }
        notificaciones.add(new Notificaciones(CUIL, ciudadano.CUIL, diaDesde, mesDesde, diaHasta, mesHasta));
    }
    public void juntada(Ciudadanos gente, String diaDesde, String diaHasta, Double Telefono){// agrega una juntada en el archivo juntadas
        for (int i = 0; i < gente.size(); i++) {
            if (Telefono.equals(gente.get(i).getTelefono())){
                Boolean confirmado = false;
                Boolean visto = false;
                try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\Anses\\JuntadasConfirm.txt"))) {
                    bufferedWriter.write(CUIL.toString() + "," + Telefono.toString() + "," + diaDesde + "," + diaHasta + "," + confirmado.toString() + "," + visto.toString());
                    bufferedWriter.newLine();
                }catch(IOException e){
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Usuario no encontrado");
    }
    public void remove(int i){// remueve sintomas
        try {
            sintomas.remove(i);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Ingrese valor existente");
        }
    }
}