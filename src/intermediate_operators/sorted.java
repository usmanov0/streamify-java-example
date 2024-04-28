package intermediate_operators;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sorted {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Elan", "BBC", "Someone", "Alan", "None");

        List<String> strList = list.stream().sorted((n1, n2) -> n1.compareTo(n2)).collect(Collectors.toList());
        System.out.println(strList);
    }
}
