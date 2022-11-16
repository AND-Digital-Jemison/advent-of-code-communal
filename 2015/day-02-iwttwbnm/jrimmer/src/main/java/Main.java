import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

    }

    private static List<String> getInput() throws IOException {
        return Files.readAllLines(Paths.get("src/main/java/input.txt"));
    }
}
