public class Social {
    public static void solicitudes(Ciudadano a, Juntadas juntadas, Ciudadanos ciudadanos){
        for (int i = 0; i < juntadas.size(); i++) {
            if (a.getTelefono().equals(juntadas.get(i).getTelefono()) && juntadas.get(i).getVisto().equals(false)){
                System.out.println("Usted se ha juntado con la persona " + juntadas.get(i).getMiTelefono() + " A partir del dia " + juntadas.get(i).getFechaDesde() + " hasta el " + juntadas.get(i).getFechaHasta() + "?");
                System.out.println("1 Si\n2 no");
                Integer confirm = Scanner.getInt("Ingrese el numero de su respuesta: ");
                switch (confirm){
                    case 1:
                        juntadas.get(i).confirmado = true;
                        juntadas.get(i).visto = true;
                        break;
                    case 2:
                        for (int j = 0; j < ciudadanos.size(); j++) {
                            if(juntadas.get(i).getMiTelefono().equals(ciudadanos.get(j).getTelefono())){
                                ciudadanos.get(j).bloqueado +=1;
                            }
                        }
                        juntadas.get(i).visto = true;
                        break;
                    default:
                        System.out.println("Valor no existente");
                        break;
                }
            }
        }
    }
}
