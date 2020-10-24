import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Ciudadano {
    private Double CUIL;
    private Double telefono;
    private String zona;
    Integer bloqueado;
    ArrayList<String> sintomas;
    Boolean coronavirus;

    public Ciudadano(Double CUIL, Double telefono, String zona){
        this.CUIL = CUIL;
        this.telefono = telefono;
        this.zona = zona;
        this.bloqueado = 0;
        this.sintomas = new ArrayList<String>();
        this.coronavirus = false;
    }

    public Ciudadano(Double CUIL, Double telefono, String zona, Integer bloqueado, Boolean coronavirus){
        this.CUIL = CUIL;
        this.telefono = telefono;
        this.zona = zona;
        this.bloqueado = bloqueado;
        this.sintomas = new ArrayList<String>();
        this.coronavirus = coronavirus;
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

    public void covid(){// Si el size de la lista de cintomas del ciudadano es mayor o igual a 3, este tiene covid
        if (sintomas.size() >= 2){
            coronavirus = true;
            System.out.println("Usted tiene coronavirus");
        }else{
            coronavirus = false;
        }
    }

    public void juntada(Ciudadanos gente, String diaDesde, String diaHasta, Double Telefono){
        for (int i = 0; i < gente.size(); i++) {
            if (Telefono.equals(gente.get(i).getTelefono())){
                Boolean confirmado = false;
                Boolean visto = false;
                try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\IdeaProjects\\TpProgramacion\\src\\Anses\\JuntadasConfirm.txt"))) {
                    bufferedWriter.write(CUIL.toString() + "," + Telefono.toString() + "," + diaDesde + "," + diaHasta + "," + confirmado.toString() + "," + visto.toString());
                    bufferedWriter.newLine();
                }catch(IOException e){
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Usuario no encontrado");
    }


}