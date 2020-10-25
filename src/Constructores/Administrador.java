package Constructores;


import ArrayLists.Administradores;
import ArrayLists.Ciudadanos;
import ArrayLists.Evento;

public class Administrador{
    private Double CUIL;
    private Double telefono;
    private String zona;


    public Administrador(Double CUIL, Double telefono, String zona){
        this.CUIL = CUIL;
        this.telefono = telefono;
        this.zona = zona;
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

    public void bloquear(Double cuil, Ciudadanos a){// bloquea a un ciudadano
        for (Integer i = 0; i < a.size(); i++){
            if (cuil.equals((a.get(i).getCUIL()))){
                a.get(i).bloqueado = 5;
            }
        }
    }

    public void desblock(Double cuil, Ciudadanos a){// desbloquea a un ciudadano
        for (Integer i = 0; i < a.size(); i++){
            if (cuil.equals((a.get(i).getCUIL()))){
                a.get(i).bloqueado = 0;
            }
        }
    }

    public Administrador transAdmin(Double cuil, Ciudadanos a, Administradores c){// Transforma un ciudadano en administrador y lo elimina de la lista de ciudadanos
        Administrador b = null;
        for (Integer i = 0; i < a.size(); i++){
            if (cuil.equals((a.get(i).getCUIL()))){
                b = new Administrador(a.get(i).getCUIL(),a.get(i).getTelefono(), a.get(i).getZona());
                a.remove(a.get(i));
                c.add(b);
            }
        }
        return b;
    }

    public Ciudadano transCiud(Double cuil, Administradores a, Ciudadanos c){// transforma el Constructores.Administrador en ciudadano
        Ciudadano b = null;
        for (Integer i = 0; i < a.size(); i++){
            if (cuil.equals((a.get(i).getCUIL()))){
                b = new Ciudadano(a.get(i).getCUIL(),a.get(i).getTelefono(), a.get(i).getZona());
                a.remove(a.get(i));
                c.add(b);
            }
        }
        return b;
    }


    public void addEvent(Evento evento, String a){// Agrega un sintoma a los eventos
        evento.add(a);
    }

    public void removeEvent(Evento evento, String a){// elimina un sintoma a los eventos
        evento.remove(a);
    }
}