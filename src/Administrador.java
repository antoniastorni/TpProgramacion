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

    public void transAdmin(Ciudadano c){

    }

    public void transCiud(Administrador c){

    }


    public void desblock(Ciudadano c){
        c.bloqueado = false;
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
