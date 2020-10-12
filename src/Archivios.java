import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Archivios {
    public static void main(String[] args) {
       String line;
        List<Ciudadano> ciudadanos = new ArrayList<Ciudadano>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/media/rodrigo/Datos/Austral/Facultad/Compu2/Archivo_texto/src/Covid/datos.txt"));){
            while ((line = bufferedReader.readLine()) != null) {
                String[] ciudadano = line.split(",");
                ciudadanos.add(new Ciudadano(Integer.parseInt(ciudadano[0]),Integer.parseInt(ciudadano[1]),(ciudadano[2])));
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}