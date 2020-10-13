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

    public void bloquear(Ciudadano c){
        c.bloqueado = true;
    }

    public void desblock(Ciudadano c){
        c.bloqueado = false;
    }

    public Administrador transAdmin(Integer cuil, Ciudadanos a){
        Administrador b = null;
        for (Integer i = 0; i < a.size(); i++){
            if (cuil.equals((a.get(i).getCUIL()))){
                b = new Administrador(a.get(i).getCUIL(),a.get(i).getTelefono(), a.get(i).getZona());
                a.remove(a.get(i));
            }
        }
        return b;
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