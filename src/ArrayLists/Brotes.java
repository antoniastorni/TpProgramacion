package ArrayLists;

import Constructores.Ciudadano;

import java.util.ArrayList;

public class Brotes {
    ArrayList<ArrayList<Double>> brotes;

    public Brotes(){
        this.brotes = new ArrayList<ArrayList<Double>>();
    }

    public void add(Integer index, Double cuil, Double dia, Double mes){
        brotes.get(index).add(cuil);
        brotes.get(index).add(dia);
        brotes.get(index).add(mes);
    }

    public void addonly(Integer index, Double a){
        brotes.get(index).add(a);
    }

    public void addNew(Double cuil, Double dia, Double mes){
        ArrayList<Double> arrayList = new ArrayList<Double>();
        arrayList.add(cuil);
        arrayList.add(dia);
        arrayList.add(mes);
        brotes.add(arrayList);
    }

    public Integer sizeArrays(){
        return brotes.size();
    }

    public Integer sizeArray(Integer index){
        return brotes.get(index).size();
    }

    public ArrayList<Double> getArray(Integer index){
        return brotes.get(index);
    }

    public Double get(Integer index, Integer index2){
        return brotes.get(index).get(index2);
    }
}
