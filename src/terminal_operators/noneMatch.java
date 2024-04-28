package terminal_operators;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class noneMatch {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("abcdef");
        list.add("abcdefg");
        list.add("abcdefghi");


        Stream<String> stream = list.stream();
        boolean result = stream.noneMatch(x -> x.equals("bc"));
        System.out.println(result);
    }
}
