package ArrayLists;

import Constructores.Ciudadano;

import java.util.ArrayList;
//Lista de todos los ciudadanos
public class Ciudadanos {
    ArrayList<Ciudadano> personas;

    public Ciudadanos(){
        this.personas = new ArrayList<Ciudadano>();
    }

    public void add(Ciudadano a){
        personas.add(a);
    }

    public void remove(Ciudadano a){
        personas.remove(a);
    }

    public Integer size(){
        return personas.size();
    }

    public Ciudadano get(Integer a){
        return personas.get(a);
    }


}
