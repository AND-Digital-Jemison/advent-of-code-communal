import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrappingPaperServiceTest {
    private final WrappingPaperService wrappingPaperService = new WrappingPaperService();

    @Test
    public void returnZero() {
        assertEquals(wrappingPaperService.calculatePaper(0, 0, 0), 0);
    }
}