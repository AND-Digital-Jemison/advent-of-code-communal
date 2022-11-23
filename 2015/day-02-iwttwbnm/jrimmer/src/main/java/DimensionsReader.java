import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DimensionsReader {
    public static Dimensions[] parseDimensions(String inputUrl) throws IOException {
        List<Dimensions> dimsList = new ArrayList<>();

        for (String line: Files.readAllLines(Paths.get(inputUrl))
             ) {
            String[] lineSplit = line.split("x");
            Dimensions dims = new Dimensions(
                    Integer.parseInt(lineSplit[0]),
                    Integer.parseInt(lineSplit[1]),
                    Integer.parseInt(lineSplit[2])
            );

            dimsList.add(dims);
        } ;

        Dimensions[] d = new Dimensions[dimsList.size()];
        return dimsList.toArray(d);
    }
}
