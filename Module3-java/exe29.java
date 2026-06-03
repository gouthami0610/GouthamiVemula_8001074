import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class exe29 {
     public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Gouthami", 21),
            new Person("Akshaya", 17),
            new Person("Shravani", 22)
        );

        people.forEach(System.out::println);

        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(Collectors.toList());

        System.out.println("Adults:");
        adults.forEach(System.out::println);
    }
}
