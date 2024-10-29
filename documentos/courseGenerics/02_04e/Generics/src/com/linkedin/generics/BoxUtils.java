package com.linkedin.generics;

public class BoxUtils {

    public static <T> int getCountOfItems(Box<T> box){
        return box.getItems().size();

    }
}
