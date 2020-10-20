import java.io.*;

public class FileManagement {
    public static void generateCiudadanos(Ciudadanos ciudadanos){
        //genera el arrayList de ciudadanos a partir de los archivos
    }

    public static void generateAdministradores(Administradores administradores){
        //genera el arrayList de administradores a partir de los archivos
        String line;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\TpProgramacion\\src\\Anses\\administradores.txt"));){
            while ((line = bufferedReader.readLine()) != null) {
                String[] administrador = line.split(",");
                administradores.add(new Administrador((Integer.parseInt(administrador[0])),(Integer.parseInt(administrador[1])),(administrador[2])));
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
    }

    public static void writeAdministradores(Administradores administradores){
        //escribe en el archivo de arrayList de administradores los nuevos cambios
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\IdeaProjects\\TpProgramacion\\src\\Anses\\administradores.txt"))) {
            for (int i = 0; i < administradores.size(); i++) {
                bufferedWriter.write((administradores.get(i).getCUIL()).toString() + (administradores.get(i).getTelefono()).toString() + (administradores.get(i).getZona()));
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
