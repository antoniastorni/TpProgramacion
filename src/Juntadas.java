import java.util.ArrayList;

public class Juntadas {
    ArrayList<Juntada> juntadas;

    public Juntadas(){
        this.juntadas = new ArrayList<Juntada>();
    }

    public void add(Juntada a){
        juntadas.add(a);
    }

    public void remove(Juntada a){
        if(juntadas.contains(a)){
            juntadas.remove(a);
        }else{
            System.out.println("Ciudadano No Encontrado");
        }
    }

    public Integer size(){
        return juntadas.size();
    }

    public Juntada get(Integer a){
        return juntadas.get(a);
    }
}
