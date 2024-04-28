package terminal_operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class toArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        Object[] srtArray = list.stream().map(s -> s.toUpperCase()).toArray();
        System.out.println(Arrays.toString(srtArray));
    }
}
