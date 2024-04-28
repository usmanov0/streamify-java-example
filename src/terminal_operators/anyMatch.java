package terminal_operators;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class anyMatch {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("ab");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        Stream<String> stream = list.stream();
        boolean anyMatch = stream.anyMatch(s -> s.startsWith("a"));
        System.out.println(anyMatch);
    }
}
