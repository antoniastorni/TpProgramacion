import java.util.ArrayList;
public class Ciudadano {
    private Integer CUIL;
    private Integer telefono;
    private String zona;
    boolean bloqueado;
    ArrayList<String> sintomas;
    boolean coronavirus = false;
    ArrayList<Integer> pendientes;

    public Ciudadano(Integer CUIL, Integer telefono, String zona){
        this.CUIL = CUIL;
        this.telefono = telefono;
        this.zona = zona;
        this.sintomas = new ArrayList<String>();
        this.pendientes = new ArrayList<Integer>();
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

    public void sintomas(Evento evento){//Printea la lista de sintomas
        evento.print();
    }

    public void elegir(Evento evento, Integer a){//Agrega un sintoma de la lista de eventos a la de el Ciudadano
        sintomas.add(evento.get(a));
        covid();
    }

    public void size(){//Muestra el tamaño de la lista de sintomas del Ciudadano
        System.out.println(sintomas.size());
    }

    public void covid(){// Si el size de la lista de cintomas del ciudadano es mayor o igual a 3, este tiene covid
        if (sintomas.size() >= 3){
            coronavirus = true;
        }else{
            coronavirus = false;
        }
    }

    public void juntada(Ciudadanos gente){
        Integer b = Scanner.getInt("Ingrese el cuil de la persona con la que se junto: ");
        for (Integer i = 0; i < gente.size(); i++){
            if (b.equals(gente.get(i).getCUIL())){
                gente.get(i).pendientes.add(CUIL);
                return;
            }
        }
        System.out.println("No se encontro el ciudadano");
    }

    public boolean confirm(Integer cuil, Ciudadanos gente){
        boolean a = false;
        for (Integer i = 0; i < gente.size(); i++){
            if (cuil.equals(gente.get(i).getCUIL())){
                Integer  estecuil = gente.get(i).getCUIL();
                while(true){
                    System.out.println("Usted se junto con el ciudadano con cuil " + estecuil + "\n 1 SI\n 2 NO");
                    int b = Scanner.getInt("Seleccione el numero de su respuesta: ");
                    switch (b) {
                        case 1:
                            a = true;
                            System.exit(0);
                            break;
                        case 2:
                            a = false;
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Ingrese un valor existente");
                            break;
                    }
                }
            }
        }
        return a;
    }
}