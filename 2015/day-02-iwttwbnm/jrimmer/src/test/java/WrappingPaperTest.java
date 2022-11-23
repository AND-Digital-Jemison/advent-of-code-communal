import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrappingPaperTest {
    WrappingPaperCalculator cal = new WrappingPaperCalculator();

    @Test
    public void calculateWrappingPaperNeeded_example1(){

        Dimensions[] dimsArray = new Dimensions[] {
                new Dimensions(2, 3, 4)
        };

        int r = cal.calculateAllWrappingPaperNeeded(dimsArray);
        assertEquals(58, r);
    }

    @Test
    public void calculateWrappingPaperNeeded_example2(){
        Dimensions[] dimsArray = new Dimensions[] {
                new Dimensions(1, 1, 10)
        };

        int r = cal.calculateAllWrappingPaperNeeded(dimsArray);
        assertEquals(43, r);
    }

    @Test
    public void calculateAllWrappingPaperNeeded(){
        Dimensions[] dimsArray = new Dimensions[] {
                new Dimensions(2, 3, 4),
                new Dimensions(1, 1, 10)
        };

        int r = cal.calculateAllWrappingPaperNeeded(dimsArray);
        assertEquals(101, r);
    }

    @Test
    public void calculateAllRibbonNeeded(){
        Dimensions[] dimsArray = new Dimensions[] {
                new Dimensions(2, 3, 4),
                new Dimensions(1, 1, 10)
        };

        int r = cal.calculateAllRibbonNeeded(dimsArray);
        assertEquals(48, r);
    }

    @Test
    public void calculateRibbonLengthNeeded_example1(){

        Dimensions[] dimsArray = new Dimensions[] {
                new Dimensions(2, 3, 4)
        };

        int r = cal.calculateAllRibbonNeeded(dimsArray);
        assertEquals(34, r);
    }

    @Test
    public void calculateRibbonLengthNeeded_example2(){

        Dimensions[] dimsArray = new Dimensions[] {
                new Dimensions(1, 1, 10)
        };

        int r = cal.calculateAllRibbonNeeded(dimsArray);
        assertEquals(14, r);
    }
}
