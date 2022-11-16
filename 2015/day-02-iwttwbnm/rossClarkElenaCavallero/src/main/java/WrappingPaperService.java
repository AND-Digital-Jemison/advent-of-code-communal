public class WrappingPaperService {

    int calculatePaper(int length, int width, int height) {
        int smallestSide = Math.min(length, Math.min(width, height));
        return (2 * length * width) + (2 * width * height) + (2 * height * length) + (int) Math.pow(smallestSide, 2);
    }

}
