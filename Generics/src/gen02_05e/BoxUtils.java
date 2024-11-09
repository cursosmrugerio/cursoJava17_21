package gen02_05e;

public class BoxUtils {

    public static <T extends Boxable> int getCountOfItems(Box<T> box){
        return box.getItems().size();

    }
}
