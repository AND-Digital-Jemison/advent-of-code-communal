import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        DimensionsReader reader = new DimensionsReader();
        Dimensions[] dimensionsList = reader.parseDimensions("src/main/java/input.txt");
        WrappingPaperCalculator wrappingCalculator = new WrappingPaperCalculator();
        int result = wrappingCalculator.calculateAllWrappingPaperNeeded(dimensionsList);

        System.out.println("Part 1 result: " + result);
    }

    private static List<String> getInput() throws IOException {
        return Files.readAllLines(Paths.get("src/main/java/input.txt"));
    }
}
