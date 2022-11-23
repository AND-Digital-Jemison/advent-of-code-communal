import java.util.Arrays;
public class WrappingPaperCalculator {

    public int calculateAllWrappingPaperNeeded(Dimensions[] dimsArray) {
        int result = 0;

        for (Dimensions d: dimsArray
        ) {
            result += calculateWrappingPaperNeeded(d);
        }

        return result;
    }

    public int calculateAllRibbonNeeded(Dimensions[] dimsArray) {
        int result = 0;

        for (Dimensions d: dimsArray
        ) {
            result += calculateRibbonLengthNeeded(d);
        }

        return result;
    }
    private int calculateWrappingPaperNeeded(Dimensions d){
        return d.surfaceArea() + d.smallestAreaSide();
    }

    private int calculateRibbonLengthNeeded(Dimensions d) {
        return d.shortestDistanceAroundSides() + d.dimensionProduct();
    }

}
