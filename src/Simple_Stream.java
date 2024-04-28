import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Simple_Stream {
    public static void main(String[] args) {
        // 1
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        Stream<Integer> stream = integers.stream();
        stream.forEach(System.out::println);
        System.out.println();


        //2
        String[] words = {"Hello ", "World ", "How ", "Are ", "You "};
        Stream<String> stringStream = Arrays.stream(words);
        stringStream.forEach(System.out::println);
    }
}
