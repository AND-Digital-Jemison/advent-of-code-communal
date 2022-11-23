import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Dimensions[] dimensionsList = DimensionsReader.parseDimensions("src/main/java/input.txt");
        WrappingPaperCalculator wrappingCalculator = new WrappingPaperCalculator();
        int part1Result = wrappingCalculator.calculateAllWrappingPaperNeeded(dimensionsList);

        System.out.println("Part 1 result: " + part1Result);

        int part2Result = wrappingCalculator.calculateAllRibbonNeeded(dimensionsList);

        System.out.println("Part 2 result: " + part2Result);
    }
}
