import java.util.stream.IntStream;

public class StreamOfPrimitives {
    public static void main(String[] args) {
        System.out.println("Empty Stream");

        IntStream emptyIntStream = IntStream.empty();
        emptyIntStream.forEach(System.out::println);

        System.out.println("\nInt array Stream");
        IntStream intStream = IntStream.of(1, 2, 3, 4);
        intStream.forEach(System.out::println);

        System.out.println("\nStream in range");
        IntStream rangeStream = IntStream.range(10, 15);
        rangeStream.forEach(System.out::println);
    }
}
