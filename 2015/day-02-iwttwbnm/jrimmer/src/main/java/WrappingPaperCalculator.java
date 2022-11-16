import java.util.Arrays;
public class WrappingPaperCalculator {

    public int calculateWrappingPaperNeeded(Dimensions d){
        return d.surfaceArea() + d.smallestAreaSide();
    }


}
