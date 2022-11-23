import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrappingServiceTest {
    private final WrappingService wrappingService = new WrappingService();

    @Test
    public void paperReturnsAreaSumPlusSpare() {
        assertEquals(wrappingService.calculatePaper(1, 1, 1), 7);
        assertEquals(wrappingService.calculatePaper(2, 3, 4), 58);
        assertEquals(wrappingService.calculatePaper(29, 13, 26), 3276);
    }

    @Test
    public void ribbonReturnsLengthPlusSpare() {
        assertEquals(wrappingService.calculateRibbon(1, 1, 1), 5);
        assertEquals(wrappingService.calculateRibbon(2, 3, 4), 34);
    }

}