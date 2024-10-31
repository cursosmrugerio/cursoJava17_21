package gen02_04e;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> items;

    public Box(){
        this.items = new ArrayList<>();
    }

    public void addItem(T t){
        this.items.add(t);
    }

    public T getLatestItem(){
        return this.items.get(items.size()-1);
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
