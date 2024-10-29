package com.linkedin.generics;

public class BoxUtils {

/*    public static <T extends Boxable> int getCountOfItems(Box<T> box){
        return box.getItems().size();
    }*/

    public static  int getCountOfItems(Box<?> box){
        return box.getItems().size();
    }

    public static <T extends Boxable> Box<T> emptyBox(){
        return new Box<>();
    }
}
