package terminal_operators;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class findAny {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Firs");
        list.add("Alis");
        list.add("John");
        list.add("Li");
        list.add("Pi");

        Optional<String> optional = list.stream().filter(s -> s.length() > 3).findAny();

        System.out.println("first element: "+optional.get());
    }
}
