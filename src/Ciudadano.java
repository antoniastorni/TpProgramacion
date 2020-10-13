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

    public void sintomas(Evento evento){//Printea la lista de sintomas
        evento.print();
    }

    public void elegir(Evento evento, Integer a){//Agrega un sintoma de la lista de eventos a la de el Ciudadano
        sintomas.add(evento.get(a));
        covid();
    }

    public void size(){//Muestra el tamaño de la lista de sintomas del Ciudadano
        System.out.println(sintomas.size());
    }

    public void covid(){// Si el size de la lista de cintomas del ciudadano es mayor o igual a 3, este tiene covid
        if (sintomas.size() >= 3){
            coronavirus = true;
        }else{
            coronavirus = false;
        }
    }
}
