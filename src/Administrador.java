import java.util.ArrayList;

public class Administrador{
    private Integer CUIL;
    private Integer telefono;
    private String zona;
    boolean bloqueado;


    public Administrador(Integer CUIL, Integer telefono, String zona){
        this.CUIL = CUIL;
        this.telefono = telefono;
        this.zona = zona;
    }

    public Integer getCUIL() {
        return CUIL;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public String getZona() {
        return zona;
    }

    public void bloquear(Ciudadano c){// bloquea a un ciudadano
        c.bloqueado = true;
    }

    public void desblock(Ciudadano c){// desbloquea a un ciudadano
        c.bloqueado = false;
    }

    public Administrador transAdmin(Integer cuil, Ciudadanos a, Administradores c){// Transforma un ciudadano en administrador y lo elimina de la lista de ciudadanos
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

    public Ciudadano transCiud(Integer cuil, Administradores a, Ciudadanos c){// transforma el Administrador en ciudadano
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