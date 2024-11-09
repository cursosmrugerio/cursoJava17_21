package gen02_03e.v1;

import java.util.ArrayList;
import java.util.List;

public class Box<X> {
    private List<X> items;

    public Box(){
        items = new ArrayList<>();
    }

    public void addItem(X x){
        items.add(x);
    }

    public X getLatestItem(){
        return items.get(items.size()-1);
    }

    public List<X> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }
}
