package com.asesoria.apx;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class MyKeys {
    Integer key;

    MyKeys(Integer k) {
        key = k;
    }
    
    public boolean equals(Object o) {
        return ((MyKeys) o).key == this.key;
    }
    
    @Override
	public int hashCode() {
		return Objects.hash(key);
	}



}

public class Main71 {

    public static void main(String[] args) {
        Map<MyKeys, String> m = new HashMap<>();

        MyKeys m1 = new MyKeys(1);
        MyKeys m2 = new MyKeys(2);
        MyKeys m3 = new MyKeys(1);
        MyKeys m4 = new MyKeys(new Integer(2));
        
        //UNBOXING
        int value0 = Integer.valueOf("0");
        
        Integer value1 = Integer.valueOf("5");
        Integer value2 = Integer.valueOf(5);
        
        int i1 = Integer.parseInt("5");
        //int i2 = Integer.parseInt(5);
        
        //AUTOBOXING
        Integer value3 = Integer.parseInt("5");
        
        Integer value4 = Integer.valueOf("99");
        Integer value5 = Integer.parseInt("99");
        
        MyKeys m5 = new MyKeys(value1);

        m.put(m1, "car");
        m.put(m2, "boat");
        m.put(m3, "plane");
        m.put(m4, "bus");

        System.out.println(m.size()); //2
        
        m.forEach((x,y)->System.out.println("Key:"+x.key));
    }
}