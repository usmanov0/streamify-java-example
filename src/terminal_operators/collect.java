package terminal_operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class collect {
    public static void main(String[] args) {
        // 1
        List<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");

        List<String> upperStr = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperStr);

        // 2
        Character[] upperChar = {'A', 'B', 'C', 'D', 'E', 'F'};
        String result = Arrays.stream(upperChar).map(c -> c.toString()).collect(Collectors.joining());
        System.out.println(result);
    }
}
