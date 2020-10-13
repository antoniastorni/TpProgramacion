import java.util.ArrayList;

public class Administradores {

    ArrayList<Administrador> administradores;

    public Administradores(){
        this.administradores = new ArrayList<Administrador>();
    }

    public void add(Administrador a){
        administradores.add(a);
    }

    public void remove(Administrador a){
        if(administradores.contains(a)){
            administradores.remove(a);
        }else{
            System.out.println("Ciudadano No Encontrado");
        }
    }

    public Integer size(){
        return administradores.size();
    }

    public Administrador get(Integer a){
        return administradores.get(a);
    }
}
