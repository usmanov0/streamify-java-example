package intermediate_operators;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class limit {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");

        List<String> Limit = list.stream().limit(3).collect(Collectors.toList());
        System.out.println(Limit);
    }
}
