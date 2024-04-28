import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamOfFile {
    public static void main(String[] args) {
        try {
            Stream<String> stream = Files.lines(Paths.get("testFile.txt"));
            stream.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
