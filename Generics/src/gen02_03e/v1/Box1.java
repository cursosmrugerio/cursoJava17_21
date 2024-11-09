package gen02_03e.v1;

import java.util.ArrayList;
import java.util.List;

public class Box1<PATO> {
    private List<PATO> items;

    public Box1(){
        items = new ArrayList<>();
    }

    public void addItem(PATO x){
        items.add(x);
    }

    public PATO getLatestItem(){
        return items.get(items.size()-1);
    }

    public List<PATO> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }
}
