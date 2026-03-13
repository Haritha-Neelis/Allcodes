import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Java8Example {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Haritha", "Ravi", "Anu", "Raj");

        // 1️⃣ Predicate (filter condition)
        Predicate<String> lengthCheck = name -> name.length() > 3;

        // 2️⃣ Function (transform data)
        Function<String, String> toUpper = name -> name.toUpperCase();

        // 3️⃣ Consumer (consume data)
        Consumer<String> printName = name -> System.out.println(name);

        // 4️⃣ Stream API + Lambda
        names.stream()
                .filter(lengthCheck)
                .map(toUpper)
                .forEach(printName);

        // 5️⃣ Method Reference
        System.out.println("Using Method Reference:");
        names.forEach(System.out::println);

        // 6️⃣ Optional (avoid null)
        Optional<String> optionalName = Optional.ofNullable("Haritha");

        optionalName.ifPresent(name -> System.out.println("Optional Value: " + name));
    }
}
