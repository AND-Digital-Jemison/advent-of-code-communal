package notquitelisp;

public class Instructions {

    private static int instructionToChange(char c) {
        switch (c) {
            case '(':
                return 1;
            case ')':
                return -1;
            default:
                return 0;
        }
    }

    public static int followToFloor(String instuctions) {
        int floor = 0;
        char[] chars = instuctions.toCharArray();
        for (char c : chars) {
            floor += instructionToChange(c);
        }
        return floor;
    }

    public static int instructionsToBasement(String instuctions) {
        int floor = 0;
        char[] chars = instuctions.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            floor += instructionToChange(c);
            if (floor < 0) {
                return i + 1;
            }
        }
        return floor;
    }
}
