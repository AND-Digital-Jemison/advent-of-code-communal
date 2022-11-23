import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DimensionsReaderTest {
    @Test
    public void parseDimensions() throws IOException {
        Dimensions[] dims = DimensionsReader.parseDimensions("src/test/java/example-input.txt");

        assertEquals(dims.length, 2);
        assertEquals(dims[0].toString(), "2x3x4");
        assertEquals(dims[1].toString(), "1x1x4");
    }
}
