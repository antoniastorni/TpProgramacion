import java.io.*;

public class FileManagement {
    public static void generateCiudadanos(Ciudadanos ciudadanos){
        //genera el arrayList de ciudadanos a partir de los archivos
        String line;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\TpProgramacion\\src\\Anses\\ciudadanos.txt"));){
            while ((line = bufferedReader.readLine()) != null) {
                String[] gente = line.split(",");
                ciudadanos.add(new Ciudadano((Double.parseDouble(gente[0])),(Double.parseDouble(gente[1])),(gente[2]), (Integer.parseInt(gente[3])), Boolean.parseBoolean(gente[4])));

            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\TpProgramacion\\src\\Anses\\EventosCiud.txt"))){
            while ((line = bufferedReader.readLine()) != null) {
                String[] eventosgente = line.split(",");
                for (int i = 0; i < ciudadanos.size(); i++) {
                    Double cuil = Double.parseDouble(eventosgente[0]);
                    if (ciudadanos.get(i).getCUIL().equals(cuil)){
                        for (int j = 1; j < eventosgente.length; j++) {
                            ciudadanos.get(i).sintomas.add(eventosgente[j]);
                        }
                    }
                }

            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void generateAdministradores(Administradores administradores){
        //genera el arrayList de administradores a partir de los archivos
        String line;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\TpProgramacion\\src\\Anses\\administradores.txt"));){
            while ((line = bufferedReader.readLine()) != null) {
                String[] administrador = line.split(",");
                administradores.add(new Administrador((Double.parseDouble(administrador[0])),(Double.parseDouble(administrador[1])),(administrador[2])));
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void generateEventos(Evento eventos){
        //genera el arrayList de eventos a partir de los archivos

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\TpProgramacion\\src\\Anses\\eventos.txt"));){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                eventos.add(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void generateJuntadas(Juntadas juntadas){
        //genera el arrayList de ciudadanos a partir de los archivos
        String line;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\TpProgramacion\\src\\Anses\\JuntadasConfirm.txt"));){
            while ((line = bufferedReader.readLine()) != null) {
                String[] juntada = line.split(",");
                juntadas.add(new Juntada((Double.parseDouble(juntada[0])),(Double.parseDouble(juntada[1])),(juntada[2]), (juntada[3]), (Boolean.parseBoolean(juntada[4])), (Boolean.parseBoolean(juntada[5]))));
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void writeCiudadanos(Ciudadanos ciudadanos){
        //escribe en el archivo de arrayList de ciudadanos los nuevos cambios
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\IdeaProjects\\TpProgramacion\\src\\Anses\\ciudadanos.txt"))) {
            for (int i = 0; i < ciudadanos.size(); i++) {
                bufferedWriter.write((ciudadanos.get(i).getCUIL()).toString() + "," + (ciudadanos.get(i).getTelefono()).toString() + "," + (ciudadanos.get(i).getZona()) + "," + (ciudadanos.get(i).getBloqueado()).toString() + "," + (ciudadanos.get(i).getCoronavirus()).toString() + ",");
                bufferedWriter.newLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\IdeaProjects\\TpProgramacion\\src\\Anses\\EventosCiud.txt"))) {
            for (int i = 0; i < ciudadanos.get(i).sintomas.size(); i++) {
                bufferedWriter.write((ciudadanos.get(i).getCUIL()).toString());
                for (int j = 0; j < ciudadanos.get(i).sintomas.size(); j++) {
                    bufferedWriter.write("," +ciudadanos.get(i).sintomas.get(j));
                }
                bufferedWriter.newLine();
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void writeEventos(Evento eventos){
        //escrive en el archivo de arrayList de eventos los nuevos cambios
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\IdeaProjects\\TpProgramacion\\src\\Anses\\eventos.txt"))) {
            for (int i = 0; i < eventos.size(); i++) {
                bufferedWriter.write(eventos.get(i));
                bufferedWriter.newLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void writeAdministrador(Administradores administradores){
        //escribe en el archivo de arrayList de ciudadanos los nuevos cambios
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\IdeaProjects\\TpProgramacion\\src\\Anses\\administradores.txt"))) {
            for (int i = 0; i < administradores.size(); i++) {
                bufferedWriter.write((administradores.get(i).getCUIL()).toString() + "," + (administradores.get(i).getTelefono()).toString() + "," + (administradores.get(i).getZona()));
                bufferedWriter.newLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

    public static void writeJuntadas(Juntadas juntadas){
        //escribe en el archivo de arrayList de ciudadanos los nuevos cambios
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\IdeaProjects\\TpProgramacion\\src\\Anses\\JuntadasConfirm.txt"))) {
            for (int i = 0; i < juntadas.size(); i++) {
                if (juntadas.get(i).getVisto().equals(false) && juntadas.get(i).getConfirmado().equals(false)){
                    bufferedWriter.write((juntadas.get(i).getMiTelefono()).toString() + "," + (juntadas.get(i).getTelefono()).toString() + "," + (juntadas.get(i).getFechaDesde()) + "," + (juntadas.get(i).getFechaHasta()) + "," + (juntadas.get(i).getConfirmado()).toString() + "," + (juntadas.get(i).getConfirmado()).toString());
                    bufferedWriter.newLine();
                }if (juntadas.get(i).getVisto().equals(true) && juntadas.get(i).getConfirmado().equals(true)){
                    bufferedWriter.write((juntadas.get(i).getMiTelefono()).toString() + "," + (juntadas.get(i).getTelefono()).toString() + "," + (juntadas.get(i).getFechaDesde()) + "," + (juntadas.get(i).getFechaHasta()) + "," + (juntadas.get(i).getConfirmado()).toString() + "," + (juntadas.get(i).getConfirmado()).toString());
                    bufferedWriter.newLine();
                }else{

                }
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
