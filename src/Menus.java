public class Menus {
    public static void menuCiudadanos(Ciudadano a, Ciudadanos ciudadanos,Evento eventos){
        //Inicia el menu de ciudadanos con sus opciones
        while(true){
            System.out.println("1 trans2formar ciudadano en administrador\n2 transformar administrador en ciudadano\n3 Agregar evento\n4 Remover evento\n5 Salir");
            int b = Scanner.getInt("Seleccione el numero de su respuesta: ");
            switch (b) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;

                case 5:
                    System.exit(0);
                default:
                    System.out.println("Ingrese un valor existente");
                    break;
            }
        }
    }

    public static void menuAdministradores(Administrador a, Ciudadanos ciudadanos, Evento eventos, Administradores administradores){
        // menu de administradores
        while(true){
            System.out.println("1 transformar ciudadano en administrador\n2 transformar administrador en ciudadano\n3 Agregar evento\n4 Remover evento\n5 Salir");
            int b = Scanner.getInt("Seleccione el numero de su respuesta: ");
            switch (b){
                case 1:
                    Integer cuil1 = Scanner.getInt("Ingrese el cuil de el ciudadano: ");
                    a.transAdmin(cuil1, ciudadanos, administradores);
                    break;
                case 2:
                    Integer cuil2 = Scanner.getInt("Ingrese el cuil de el administrador: ");
                    a.transCiud(cuil2, administradores, ciudadanos);
                    break;
                case 3:
                    String evento1 = Scanner.getString("Que sintoma desea agregar: ");
                    a.addEvent(eventos, evento1);
                    break;
                case 4:
                    String evento2 = Scanner.getString("Que sintoma desea eliminar: ");
                    a.removeEvent(eventos, evento2);
                    break;
                case 5:
                    FileManagement.writeEventos(eventos);
                    System.exit(0);
                default:
                    System.out.println("Ingrese un valor existente");
                    break;
            }
        }
    }
}
