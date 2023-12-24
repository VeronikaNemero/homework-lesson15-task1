import java.util.HashSet;
import java.util.List;

public class Collect {

    public static void collect(String[] array){
        HashSet<String> set = new HashSet<>();
        set.addAll(List.of(array));
        set.forEach(System.out::println);
    }
}
