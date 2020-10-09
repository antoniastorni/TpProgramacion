import java.util.ArrayList;
public class Ciudadano extends Usuario {
    Integer CUIL;
    Integer telefono;
    String zona;
    boolean bloqueado;
    ArrayList<String> Sintomas;
    boolean coronavirus = false;

    public Ciudadano(Integer CUIL, Integer telefono, String zona){
        super(CUIL, telefono, zona);
        this.Sintomas = new ArrayList<String>();
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

    public void sintomas(Administrador admin){
        admin.print();
    }

    public void elegir(Administrador admin, Integer a){
        Sintomas.add(admin.get(a));
        covid();
    }

    public void size(){
        System.out.println(Sintomas.size());
    }

    public void covid(){
        if (Sintomas.size() >= 3){
            coronavirus = true;
        }else{
            coronavirus = false;
        }
    }


}
