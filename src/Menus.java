public class Menus {
    public static void menuCiudadanos(Ciudadano a, Ciudadanos ciudadanos,Evento eventos){
        //Inicia el menu de ciudadanos con sus opciones
        for (int i = 0; i < a.pendientes.size(); i++) {
            System.out.println("Usted se a juntado con " + a.pendientes.get(i).getTelefono() + " a partir del " + a.pendientes.get(i).fechaDesde + " Hasta " + a.pendientes.get(i).fechaDesde + "?");
            System.out.println("1 Si\n2 No");
            Integer e = Scanner.getInt("Seleccione su respuesta");
            switch (e){
                case 1:
                    a.juntadas.add(a.pendientes.get(i));
                    a.pendientes.remove(i);
                    break;
                case 2:
                    for (int j = 0; j < ciudadanos.size(); j++) {
                        if (a.pendientes.get(i).getTelefono().equals(ciudadanos.get(j).getTelefono())){
                            ciudadanos.get(j).bloqueado += 1;
                            a.juntadas.remove(i);
                        }
                    }
                default:
                    System.out.println("Ingrese un valor existente");
                    break;
            }
        }

        while(true){
            System.out.println("1 Reportar sintomas\n2 Remover sintoma\n3 Reportar juntada\n4 Salir");
            int b = Scanner.getInt("Seleccione el numero de su respuesta: ");
            switch (b) {
                case 1:
                    eventos.print();
                    Integer i = Scanner.getInt("seleccione el sintoma: ");
                    a.agregar(eventos, i);
                    break;
                case 2:
                    a.printSintomas();
                    Integer remove = Scanner.getInt("seleccione el sintoma: ");
                    a.sintomas.remove(remove);
                    break;
                case 3:
                    Double Telefono = Scanner.getDouble("Ingrese el Telefono de la persona con la que se junto");
                    String diaDesde = Scanner.getString("desde que fecha? (Ingrese Dia/Mes/Año): ");
                    String diaHasta = Scanner.getString("Hasta que fecha? (Ingrese Dia/Mes/Año): ");
                    a.juntada(ciudadanos, diaDesde, diaHasta, Telefono);
                    break;
                case 4:
                    FileManagement.writeCiudadanos(ciudadanos);
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
                    Double cuil1 = Scanner.getDouble("Ingrese el cuil de el ciudadano: ");
                    a.transAdmin(cuil1, ciudadanos, administradores);
                    break;
                case 2:
                    Double cuil2 = Scanner.getDouble("Ingrese el cuil de el administrador: ");
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
                    FileManagement.writeCiudadanos(ciudadanos);
                    System.exit(0);
                default:
                    System.out.println("Ingrese un valor existente");
                    break;
            }
        }
    }
}
