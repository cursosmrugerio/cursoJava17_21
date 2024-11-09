package gen02_03e;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> items;

    public Box(){
        items = new ArrayList<>();
    }

    public void addItem(T t){
        items.add(t);
    }

    public T getLatestItem(){
        return items.get(items.size()-1);
    }

    public List<T> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }
}
