package terminal_operators;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class max {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Hello");
        list.add("Hi");
        list.add("How are you");
        list.add("World");

        Optional<String> optional = list.stream().max((o1, o2) -> o1.length() - o2.length());
        System.out.println(optional.get());
    }
}
