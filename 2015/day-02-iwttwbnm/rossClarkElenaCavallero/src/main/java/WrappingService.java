import java.util.Arrays;

public class WrappingService {

    int calculatePaper(int length, int width, int height) {
        int side1 = length * width;
        int side2 = width * height;
        int side3 = length * height;

        int smallestSide = Math.min(side1, Math.min(side2, side3));

        return (2 * side1) + (2 * side2) + (2 * side3) + smallestSide;
    }
    int calculateRibbon(int length, int width, int height) {
        int[] ints = {length, width, height};
        Arrays.sort(ints);

        int firstSmallestSide = ints[0];
        int secondSmallestSide = ints[1];
        int sumSmallestSides = firstSmallestSide* 2+ secondSmallestSide*2;
        int bowLength = length * width * height;

        return sumSmallestSides + bowLength ;

    }

}
