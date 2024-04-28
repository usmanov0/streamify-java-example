package intermediate_operators;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class map {
    public static void main(String[] args) {
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        Stream<String> numberStream = Stream.of(numbers);

        List<Integer> integerList = numberStream.map(item -> item.length()).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
