import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> input = getInput();
        NotQuiteLisp notQuiteLisp = new NotQuiteLisp();

        System.out.println("First Part: ");
        System.out.println(notQuiteLisp.getFloor(input.get(0)));
        System.out.println("");

        System.out.println("Second Part: ");
        System.out.println(notQuiteLisp.getFirstBasementIndex(input.get(0)));
    }

    private static List<String> getInput() throws IOException {
        return Files.readAllLines(Paths.get("src/main/java/input.txt"));
    }
}
