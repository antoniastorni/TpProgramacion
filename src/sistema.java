public class sistema {
    public static void main(String[] args) {
        Ciudadanos ciudadanos = new Ciudadanos();
        Administradores administradores = new Administradores();
        Evento eventos = new Evento();
        generateCiudadanos(ciudadanos);
        generateAdministradores(administradores);
        generateEventos(eventos);
        menuInicial(ciudadanos, administradores, eventos);

    }

    public static void generateCiudadanos(Ciudadanos ciudadanos){
        //genera el arrayList de ciudadanos a partir de los archivos
    }

    public static void generateAdministradores(Administradores administradores){
        //genera el arrayList de administradores a partir de los archivos
    }

    public static void generateEventos(Evento eventos){
        //genera el arrayList de eventos a partir de los archivos
    }

    public static void writeCiudadanos(Ciudadanos ciudadanos){
        //escrive en el archivo de arrayList de ciudadanos los nuevos cambios
    }

    public static void writeAdministradores(Ciudadanos ciudadanos){
        //escrive en el archivo de arrayList de administradores los nuevos cambios
    }

    public static void writeEventos(Ciudadanos ciudadanos){
        //escrive en el archivo de arrayList de eventos los nuevos cambios
    }

    public static void menuInicial(Ciudadanos ciudadanos, Administradores administradores, Evento eventos){
        while(true){
            System.out.println("1 Ingresar con cuenta existente\n 2 Ingresar con nueva cuenta");
            int b = Scanner.getInt("Seleccione el numero de su respuesta: ");
            switch (b) {
                case 1:
                    int a = Scanner.getInt("Ingrese su CUIL");
                    int c =Scanner.getInt("Ingrese su Telefono");
                    buscarUsuario(a, c, ciudadanos, administradores, eventos);
                    System.exit(0);
                    break;
                case 2:
                    crearCuenta(ciudadanos, eventos);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese un valor existente");
                    break;
            }
        }
    }


    public static void crearCuenta(Ciudadanos ciudadanos, Evento eventos){
        Integer cuil = Scanner.getInt("Ingrese su cuil: ");
        Integer telefono = Scanner.getInt("Ingrese su numero de telefono: ");
        String zona = Scanner.getString("Ingrese su zona: ");
        Ciudadano ciudadano = new Ciudadano(cuil, telefono, zona);
        ciudadanos.add(ciudadano);
        menuCiudadanos(ciudadano, ciudadanos, eventos);

    }

    public static void buscarUsuario(Integer cuil, Integer telefono, Ciudadanos ciudadanos, Administradores administradores, Evento eventos){
        for (int i = 0;  i < ciudadanos.size(); i++){
            if(cuil.equals(ciudadanos.get(i).getCUIL())){
                if (telefono.equals(ciudadanos.get(i).getTelefono())){
                    menuCiudadanos(ciudadanos.get(i), ciudadanos, eventos);
                    return;
                }
            }
        }
        for (int i = 0;  i < administradores.size(); i++){
            if(cuil.equals(administradores.get(i).getCUIL())){
                if (telefono.equals(ciudadanos.get(i).getTelefono())){
                    menuAdministradores(administradores.get(i), ciudadanos, eventos);
                    return;
                }
            }
        }
        System.out.println("Usuario no encontrado");
        menuInicial(ciudadanos, administradores, eventos);
    }

    public static void menuCiudadanos(Ciudadano a, Ciudadanos ciudadanos,Evento eventos){
        //Inicia el menu de ciudadanos con sus opciones
        while(true){
            System.out.println("1 transformar ciudadano en administrador\n 2 transformar administrador en ciudadano\n 3 Agregar evento\n 4 Remover evento\n 5 Salir");
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

    public static void menuAdministradores(Administrador a, Ciudadanos ciudadanos, Evento eventos){
        // menu de administradores
        while(true){
            System.out.println("1 transformar ciudadano en administrador\n 2 transformar administrador en ciudadano\n 3 Agregar evento\n 4 Remover evento\n 5 Salir");
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
}
