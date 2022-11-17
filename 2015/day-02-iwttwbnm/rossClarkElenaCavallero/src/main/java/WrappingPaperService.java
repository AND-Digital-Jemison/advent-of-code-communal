public class WrappingPaperService {

    int calculatePaper(int length, int width, int height) {
        int side1 = length * width;
        int side2 = width * height;
        int side3 = length * height;

        int smallestSide = Math.min(side1, Math.min(side2, side3));

        return (2 * side1) + (2 * side2) + (2 * side3) + smallestSide;
    }

}
