import java.util.ArrayList;

public class Evento {
    /* Los administradores darán de alta distintos tipos de eventos
    (en general utilizado para síntomas de enfermedades),
    consistiendo simplemente de un nombre de evento
    y con 0 a N eventos relacionados.
    */
    ArrayList<String> Sintoma;

    public Evento(){
        this.Sintoma = new ArrayList<String>();
    }

    public void add(String a){
        Sintoma.add(a);
    }

    public void remove(String a){
        if(Sintoma.contains(a)){
            Sintoma.remove(a);
        }else{
            System.out.println("Sintoma No Encontrado");
        }
    }

    public void print(){
        for (int i = 0; i < Sintoma.size(); i++){
            System.out.println(i + " " + Sintoma.get(i));
        }
    }

    public String get(Integer i){
        return Sintoma.get(i);
    }



}