import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrappingPaperTest {
    WrappingPaperCalculator cal = new WrappingPaperCalculator();

    @Test
    public void calculateWrappingPaperNeeded_example1(){
        int r = cal.calculateWrappingPaperNeeded(new Dimensions(2,3,4));
        assertEquals(58, r);
    }

    @Test
    public void calculateWrappingPaperNeeded_example2(){
        int r = cal.calculateWrappingPaperNeeded(new Dimensions(1,1,10));
        assertEquals(43, r);
    }
}
