package terminal_operators;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class allMatch {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("abcdef");
        list.add("abcdefg");
        list.add("abcdefghi");
        list.add("abcdefghij");

        Stream<String> stream = list.stream();
        boolean allMatch = stream.allMatch(s -> s.length() > 6);
        System.out.println(allMatch);
    }
}
