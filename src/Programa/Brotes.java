package Programa;

import ArrayLists.Ciudadanos;
import ArrayLists.Juntadas;
import Constructores.Ciudadano;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Brotes {
    public static void brotes(Ciudadanos ciudadanos, Juntadas juntadas){
        String line;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\Anses\\CovidCiud.txt"));){
            while ((line = bufferedReader.readLine()) != null) {
                String[] gente = line.split(",");

            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
