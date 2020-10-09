import java.util.ArrayList;
public class Ciudadano extends Usuario {
    Integer CUIL;
    Integer telefono;
    String zona;
    boolean bloqueado;
    ArrayList<String> Sintomas;

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
    }

    public void size(){
        System.out.println(Sintomas.size());
    }


}
