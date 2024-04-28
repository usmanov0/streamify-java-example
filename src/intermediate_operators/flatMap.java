package intermediate_operators;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatMap {
    public static void main(String[] args) {
        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);

        Stream<List<Integer>> numStream = Stream.of(evens, odds, primes);

        List<Integer> numbers = numStream.flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println(numbers);
    }
}
