import java.util.Arrays;

public class Dimensions {
    private final int width;
    private final int height;
    private final int length;

    public Dimensions(int width, int height, int length){
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int smallestAreaSide(){
        int[] array = { widthLength(), widthHeight(), heightLength()};
        Arrays.sort(array); // LengthXWidth

        return array[0];
    }

    public int surfaceArea(){
        return ((2* widthLength()) + (2* widthHeight()) + (2* heightLength()));
    }

    private int widthLength(){
        return width*length;
    }

    private int heightLength(){
        return height * length;
    }
    private int widthHeight(){
        return height* width;
    }

}
