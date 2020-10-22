import java.util.ArrayList;
public class Ciudadano {
    private Double CUIL;
    private Double telefono;
    private String zona;
    Integer bloqueado;
    ArrayList<String> sintomas;
    Boolean coronavirus;
    ArrayList<Juntada> pendientes;
    ArrayList<Juntada> juntadas;

    public Ciudadano(Double CUIL, Double telefono, String zona){
        this.CUIL = CUIL;
        this.telefono = telefono;
        this.zona = zona;
        this.bloqueado = 0;
        this.sintomas = new ArrayList<String>();
        this.coronavirus = false;
        this.pendientes = new ArrayList<Juntada>();
        this.juntadas = new ArrayList<Juntada>();
    }

    public Ciudadano(Double CUIL, Double telefono, String zona, Integer bloqueado, Boolean coronavirus){
        this.CUIL = CUIL;
        this.telefono = telefono;
        this.zona = zona;
        this.bloqueado = bloqueado;
        this.sintomas = new ArrayList<String>();
        this.coronavirus = coronavirus;
        this.pendientes = new ArrayList<Juntada>();
        this.juntadas = new ArrayList<Juntada>();
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

    public void agregar(Evento evento, Integer a){//Agrega un sintoma de la lista de eventos a la de el Ciudadano
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

    public void juntada(Ciudadanos gente, String diaDesde, String diaHasta, Double Telefono){
        for (int i = 0; i < gente.size(); i++) {
            if (Telefono.equals(gente.get(i).getTelefono())){
                gente.get(i).pendientes.add(new Juntada(Telefono, diaDesde, diaHasta));
                System.out.println("Solicitud penndiente");
                return;
            }
        }
    }

    public void printSintomas(){
        for (int i = 0; i < sintomas.size(); i++){
            System.out.println(i + " " + sintomas.get(i));
        }
    }
}