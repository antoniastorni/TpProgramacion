import java.io.*;

public class FileManagement {
    public static void generateCiudadanos(Ciudadanos ciudadanos){
        //genera el arrayList de ciudadanos a partir de los archivos
        String line;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\TpProgramacion\\src\\Anses\\ciudadanos.txt"));){
            while ((line = bufferedReader.readLine()) != null) {
                String[] administrador = line.split(", ");
                ciudadanos.add(new Ciudadano((Double.parseDouble(administrador[0])),(Double.parseDouble(administrador[1])),(administrador[2]), (Integer.parseInt(administrador[3])), Boolean.parseBoolean(administrador[4])));
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

    public static void writeCiudadanos(Ciudadanos ciudadanos){
        //escribe en el archivo de arrayList de ciudadanos los nuevos cambios
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\IdeaProjects\\TpProgramacion\\src\\Anses\\ciudadanos.txt"))) {
            for (int i = 0; i < ciudadanos.size(); i++) {
                bufferedWriter.write((ciudadanos.get(i).getCUIL()).toString() + ", " + (ciudadanos.get(i).getTelefono()).toString() + ", " + (ciudadanos.get(i).getZona()) + ", " + (ciudadanos.get(i).getBloqueado()).toString() + ", " + (ciudadanos.get(i).getCoronavirus()).toString());
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
}
