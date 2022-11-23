import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    private static WrappingService wrappingService = new WrappingService();

    public static void main(String[] args) throws IOException {
        getInput();
    }

    private static void getInput() throws IOException {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("src/main/java/input.txt"));
            String line = reader.readLine();
            int paperSum = 0;
            int ribbonSum = 0;
            while (line != null) {
                int[] elements = Arrays.stream(line.split("x")).mapToInt(Integer::parseInt).toArray();
                paperSum += wrappingService.calculatePaper(elements[0], elements[1], elements[2]);
                ribbonSum += wrappingService.calculateRibbon(elements[0], elements[1], elements[2]);
                line = reader.readLine();
            }
            System.out.println(paperSum);
            System.out.println(ribbonSum);

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
