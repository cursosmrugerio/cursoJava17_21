package gen02_04e.v1;

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
    
    public static <T> int getCountOfItems(Box<T> box){
        return box.getItems().size();
    }
    
//    public static <U> int getCountOfItems(Box<U> box){
//        return box.getItems().size();
//    }
}
