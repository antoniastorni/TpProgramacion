import java.util.ArrayList;

public class Administrador extends Usuario{
    Integer CUIL;
    Integer telefono;
    String zona;
    boolean bloqueado;


    public Administrador(Integer CUIL, Integer telefono, String zona){
        super(CUIL, telefono, zona);
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

    public void bloquear(Ciudadano c){
        c.bloqueado = true;
    }

    public void desblock(Ciudadano c){
        c.bloqueado = false;
    }

    public Administrador transAdmin(Ciudadano c){
        return new Administrador(c.getCUIL(),c.getTelefono(), c.getZona());
    }

    public Ciudadano transCiud(Administrador c){
        return new Ciudadano(c.getCUIL(),c.getTelefono(), c.getZona());
    }


    public void addEvent(Evento evento, String a){
        evento.add(a);
    }

    public void removeEvent(Evento evento, String a){
        evento.remove(a);
    }
}
