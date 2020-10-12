import java.util.ArrayList;

public class Evento {
    /* Los administradores darán de alta distintos tipos de eventos
    (en general utilizado para síntomas de enfermedades),
    consistiendo simplemente de un nombre de evento
    y con 0 a N eventos relacionados.
    */
    ArrayList<String> sintoma;

    public Evento(){
        this.sintoma = new ArrayList<String>();
    }

    public void add(String a){
        sintoma.add(a);
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



}