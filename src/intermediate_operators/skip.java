package intermediate_operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class skip {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> result = Arrays.stream(numbers).skip(3).collect(Collectors.toList());
        System.out.println(result);
    }
}
