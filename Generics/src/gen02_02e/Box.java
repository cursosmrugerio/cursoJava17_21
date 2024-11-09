package gen02_02e;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
	
    private List<T> items;

    public Box(){
        this.items = new ArrayList<>();
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
