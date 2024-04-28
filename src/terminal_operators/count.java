package terminal_operators;

import java.util.ArrayList;
import java.util.List;

public class count {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("ab");
        list.add("abc");
        list.add("abcd");
        list.add("abcde");

        long count = list.stream().filter(s ->  s.length() > 3).count();

        System.out.println("count: " + count);
    }
}
