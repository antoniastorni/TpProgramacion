public class Inicio {
    public static void menuInicial(Ciudadanos ciudadanos, Administradores administradores, Evento eventos){
        while(true){
            System.out.println("1 Iniciar secion\n2 Crear cuenta");
            int b = Scanner.getInt("Seleccione el numero de su respuesta: ");
            switch (b) {
                case 1:
                    int a = Scanner.getInt("Ingrese su CUIL: ");
                    int c =Scanner.getInt("Ingrese su Telefono: ");
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
        Menus.menuCiudadanos(ciudadano, ciudadanos, eventos);
    }

    public static void buscarUsuario(Integer cuil, Integer telefono, Ciudadanos ciudadanos, Administradores administradores, Evento eventos){
        for (int i = 0;  i < ciudadanos.size(); i++){
            if(cuil.equals(ciudadanos.get(i).getCUIL()) && telefono.equals(ciudadanos.get(i).getTelefono())){
                Menus.menuCiudadanos(ciudadanos.get(i), ciudadanos, eventos);
            }
        }
        for (int i = 0;  i < administradores.size(); i++){
            if(cuil.equals(administradores.get(i).getCUIL()) && telefono.equals(administradores.get(i).getTelefono())){
                Menus.menuAdministradores(administradores.get(i), ciudadanos, eventos, administradores);
            }
        }
        System.out.println("Usuario no encontrado");
        menuInicial(ciudadanos, administradores, eventos);
    }

}
