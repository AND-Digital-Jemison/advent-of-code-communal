import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Main.Program("");
    };

    public static int Program(String input) {
        if (input == "") {
            return 0;
        }
        if (input == "(") {
            return 1;
        }
        return 0;
    }
}
