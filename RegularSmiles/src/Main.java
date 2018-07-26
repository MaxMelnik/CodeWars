import java.util.*;

public class Main {
    public static int countSmileys(List<String> arr) {
        return (int) arr.stream().filter(x -> x.matches("[:;][-~]?[)D]")).count();
    }

    public static void main(String[] args) {
        System.out.println(countSmileys(Arrays.asList(":)", ";~D", ":D", ":(")));
    }
}
