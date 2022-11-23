import java.util.Arrays;
public class WrappingPaperCalculator {

    private int calculateWrappingPaperNeeded(Dimensions d){
        return d.surfaceArea() + d.smallestAreaSide();
    }


    public int calculateAllWrappingPaperNeeded(Dimensions[] dimsArray) {
        int result = 0;

        for (Dimensions d: dimsArray
             ) {
            result += calculateWrappingPaperNeeded(d);
        }

        return result;
    }

    public int calculateRibbonLengthNeeded(Dimensions d) {
        return d.shortestDistanceAroundSides() + d.dimensionProduct();
    }
}
