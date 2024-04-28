package terminal_operators;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class min {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Hello");
        list.add("Hi");
        list.add("How are you");
        list.add("World");

        Optional<String> optional = list.stream().min((o1,o2) -> o1.length() - o2.length());
        System.out.println(optional.get());
    }
}
