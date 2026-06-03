import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exe27 {
     public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Gouthami");
        names.add("Akshaya");
        names.add("Shravani");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println(names);
    }
}
