import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrappingPaperServiceTest {
    private final WrappingPaperService wrappingPaperService = new WrappingPaperService();

    @Test
    public void returnAreaSumPlusSpare() { assertEquals(wrappingPaperService.calculatePaper(1, 1, 1), 7); }

    @Test
    public void returnAreaSumPlusSpare2() { assertEquals(wrappingPaperService.calculatePaper(2, 3, 4), 56); }

}