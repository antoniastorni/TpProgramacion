import java.util.ArrayList;
//Lista de los sintomas de covid
public class Evento {

    ArrayList<String> sintoma;

    public Evento(){
        this.sintoma = new ArrayList<String>();
    }

    public void add(String a){
        if(sintoma.contains(a)){
            System.out.println("Este sintoma ya existe");
        }else{
            sintoma.add(a);
        }
    }

    public void remove(String a){
        if(sintoma.contains(a)){
            sintoma.remove(a);
        }else{
            System.out.println("Sintoma No Encontrado");
        }
    }

    public void print(){
        for (int i = 0; i < sintoma.size(); i++){
            System.out.println(i + " " + sintoma.get(i));
        }
    }

    public String get(Integer i){
        return sintoma.get(i);
    }

    public Integer size(){
        return sintoma.size();
    }



}