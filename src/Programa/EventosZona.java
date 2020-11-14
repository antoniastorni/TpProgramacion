package Programa;

import ArrayLists.Ciudadanos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EventosZona {
    public static void EventosRanking(Ciudadanos ciudadanos, String zona){
        ArrayList<String> eventosDeZona = new ArrayList<>();
        for (int i = 0; i < ciudadanos.size(); i++) {
            if (zona.equals(ciudadanos.get(i).getZona())){
                for (int j = 0; j < ciudadanos.get(i).sintomas.size(); j++) {
                    eventosDeZona.add(ciudadanos.get(i).sintomas.get(j));
                }
            }
        }
        Map<Integer, String> mp= new HashMap<Integer, String>();
        int count=0;

        for(int i=0;i<eventosDeZona.size();i++){
            count=0;

            for(int j=0;j<eventosDeZona.size();j++){
                if(eventosDeZona.get(i).equals(eventosDeZona.get(j))){
                    count++;
                }
            }
            mp.put(count,eventosDeZona.get(i));
        }
        ArrayList<Integer> ordenar = new ArrayList<>();
        for (Integer key : mp.keySet()){
            ordenar.add(key);
        }
        for(int x = 0; x < ordenar.size(); x++){
            for(int i = 0; i < ordenar.size()-x-1; i++){
                if(ordenar.get(i) > ordenar.get(i+1)){
                    Integer ord = ordenar.get(i+1);
                    ordenar.set(i+1, ordenar.get(i));
                    ordenar.set(i, ord);
                }
            }
        }
        if (ordenar.size() <= 3){
            for (int i = ordenar.size()-1; i >= 0; i--) {
                System.out.println(mp.get(ordenar.get(i)));
            }
        }else{
            for (int i = ordenar.size()-1; i >= ordenar.size()-3; i--) {
                System.out.println(mp.get(ordenar.get(i)));
            }
        }
    }
}
