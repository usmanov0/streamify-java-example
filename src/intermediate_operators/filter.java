package intermediate_operators;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filter {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stream<Integer> integerStream = Stream.of(numbers);

        List<Integer> integerList = integerStream.filter(num -> num >= 5).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
