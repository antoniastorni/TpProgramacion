package Programa;

import ArrayLists.Administradores;
import ArrayLists.Ciudadanos;
import ArrayLists.Evento;
import Constructores.Administrador;
import Constructores.Ciudadano;
import Programa.EventosZona;

public class Tester {// tester para
    public static void main(String[] args) {
        Administrador admin1 = new Administrador((double)123,(double)1234, "");
        Administrador admin2 = new Administrador((double)321,(double)4321,"");
        Ciudadano ciud = new Ciudadano((double)345,(double)3456, "");
        Ciudadano ciud2 = new Ciudadano((double)876,(double)8765,"chaco");
        Ciudadanos gente = new Ciudadanos();
        Administradores admins = new Administradores();
        admins.add(admin1);
        admins.add(admin2);
        gente.add(ciud);
        gente.add(ciud2);
        System.out.println(ciud.getCUIL());
        System.out.println(gente.size());
        System.out.println(admins.size());
        Administrador nuevo = admin1.transAdmin((double)876, gente, admins);
        System.out.println(gente.size());
        System.out.println(admins.size());
        Evento evento = new Evento();
        admin1.addEvent(evento, "fiebre");
        admin1.addEvent(evento, "gripe");
        admin2.addEvent(evento, "dolor de cabeza");
        nuevo.addEvent(evento, "dolor de panza");
        ciud.agregar(evento, 0);
        ciud.agregar(evento, 1);
        ciud.agregar(evento, 2);
        if (ciud.coronavirus){
            System.out.println("hola");
        }
    }
}
