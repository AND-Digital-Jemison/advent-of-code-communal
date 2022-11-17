import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static WrappingPaperService wrappingPaperService = new WrappingPaperService();

    public static void main(String[] args) throws IOException {
        getInput();
    }

    private static void getInput() throws IOException {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("src/main/java/input.txt"));
            String line = reader.readLine();
            int sum = 0;
            while (line != null) {
                int[] elements = Arrays.stream(line.split("x")).mapToInt(Integer::parseInt).toArray();
                sum += wrappingPaperService.calculatePaper(elements[0], elements[1], elements[2]);
                line = reader.readLine();
            }
            System.out.println(sum);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
