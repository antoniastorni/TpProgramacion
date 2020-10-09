public class Tester {
    public static void main(String[] args) {
        Administrador admin1 = new Administrador(123,1234, "");
        Administrador admin2 = new Administrador(321,4321,"");
        Ciudadano ciud = new Ciudadano(345,3456, "");
        admin1.addEvent("dolor de pansa");
        admin1.addEvent("dolor de cabeza");
        admin2.addEvent("fiebre");
        ciud.sintomas(admin1);
        ciud.sintomas(admin2);
        ciud.elegir(admin1, 0);
        ciud.size();
        admin1.bloquear(ciud);
        if (ciud.bloqueado){
            System.out.println("hola");
        }

    }
}
