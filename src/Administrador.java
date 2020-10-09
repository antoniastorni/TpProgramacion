import java.util.ArrayList;

public class Administrador extends Usuario{
    Integer CUIL;
    Integer telefono;
    String zona;
    boolean bloqueado;
    Evento evento;

    public Administrador(Integer CUIL, Integer telefono, String zona){
        super(CUIL, telefono, zona);
        this.evento = new Evento();
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


    public void addEvent(String a){
        evento.add(a);
    }

    public void remove(String a){
        evento.remove(a);
    }

    public void print(){
        evento.print();
    }
    public String get(int i){
        return evento.get(i);
    }
}
