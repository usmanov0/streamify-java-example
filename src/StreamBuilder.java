import java.util.stream.Stream;

public class StreamBuilder {
    public static void main(String[] args) {
        Stream<String> streamBuilder = Stream.<String>builder()
                .add("First")
                .add("Second")
                .add("Third").build();
        streamBuilder.forEach(System.out::println);
    }
}
