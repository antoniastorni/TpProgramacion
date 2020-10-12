public class Tester {
    public static void main(String[] args) {
        Administrador admin1 = new Administrador(123,1234, "");
        Administrador admin2 = new Administrador(321,4321,"");
        Ciudadano ciud = new Ciudadano(345,3456, "");
        Evento evento = new Evento();
        admin1.addEvent(evento, "fiebre");
        admin1.addEvent(evento, "gripe");
        admin2.addEvent(evento, "dolor de cabeza");
        ciud.sintomas(evento);
        ciud.sintomas(evento);
        ciud.elegir(evento, 0);
        ciud.size();
        admin1.bloquear(ciud);
        if (ciud.bloqueado){
            System.out.println("hola");
        }

    }
}
