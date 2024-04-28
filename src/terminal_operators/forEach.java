package terminal_operators;

import java.util.ArrayList;
import java.util.List;

public class forEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("someone1");
        list.add("someone2");
        list.add("someone3");
        list.add("someone4");

        list.stream().forEach(s -> System.out.println(s));
    }
}
