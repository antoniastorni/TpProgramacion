package ArrayLists;

import Constructores.Ciudadano;
import Constructores.Notificaciones;

import java.util.ArrayList;

public class NotificacionesTotales {

    ArrayList<Notificaciones> notificaciones;

    public NotificacionesTotales(){
        this.notificaciones = new ArrayList<Notificaciones>();
    }

    public void add(Notificaciones a){
        notificaciones.add(a);
    }

    public void remove(Notificaciones a){
        notificaciones.remove(a);
    }

    public Integer size(){
        return notificaciones.size();
    }

    public Notificaciones get(Integer a){
        return notificaciones.get(a);
    }

}
