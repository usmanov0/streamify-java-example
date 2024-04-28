import java.util.stream.Stream;

public class StreamGenerate {
    public static void main(String[] args) {
        Stream<String> stringGenerated =
                Stream.generate(() -> "Hello World").limit(10);
        stringGenerated.forEach(System.out::println);
    }
}
