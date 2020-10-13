import java.util.ArrayList;
public class Ciudadano {
    private Integer CUIL;
    private Integer telefono;
    private String zona;
    boolean bloqueado;
    ArrayList<String> sintomas;
    boolean coronavirus = false;

    public Ciudadano(Integer CUIL, Integer telefono, String zona){
        this.CUIL = CUIL;
        this.telefono = telefono;
        this.zona = zona;
        this.sintomas = new ArrayList<String>();
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

    public void sintomas(Evento evento){
        evento.print();
    }

    public void elegir(Evento evento, Integer a){
        sintomas.add(evento.get(a));
        covid();
    }

    public void size(){
        System.out.println(sintomas.size());
    }

    public void covid(){
        if (sintomas.size() >= 3){
            coronavirus = true;
        }else{
            coronavirus = false;
        }
    }
}
