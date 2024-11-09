package gen02_03e.v1;

import java.util.ArrayList;
import java.util.List;

public class Box2<integer> {
    private List<integer> items;

    public Box2(){
        items = new ArrayList<>();
    }

    public void addItem(integer x){
        items.add(x);
    }

    public integer getLatestItem(){
        return items.get(items.size()-1);
    }

    public List<integer> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }
}
