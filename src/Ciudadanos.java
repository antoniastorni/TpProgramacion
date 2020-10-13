import java.util.ArrayList;

public class Ciudadanos {
    ArrayList<Ciudadano> personas;

    public Ciudadanos(){
        this.personas = new ArrayList<Ciudadano>();
    }

    public void add(Ciudadano a){
        personas.add(a);
    }

    public void remove(Ciudadano a){
        if(personas.contains(a)){
            personas.remove(a);
        }else{
            System.out.println("Ciudadano No Encontrado");
        }
    }

    public Integer size(){
        return personas.size();
    }

    public Ciudadano get(Integer a){
        return personas.get(a);
    }


}
