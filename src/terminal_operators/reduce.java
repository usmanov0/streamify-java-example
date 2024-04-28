package terminal_operators;

import java.util.Arrays;
import java.util.Optional;

public class reduce {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};

        //1
        Optional<Integer> resultSum = Arrays.stream(numbers).reduce(Integer::sum);
        //2
        Optional<Integer> resultMax = Arrays.stream(numbers).reduce(Integer::max);
        //3
        Optional<Integer> resultMin = Arrays.stream(numbers).reduce(Integer::min);
        System.out.println("Sum: "+resultSum.get());
        System.out.println("Max: "+resultMax.get());
        System.out.println("Min: "+resultMin.get());
    }
}
