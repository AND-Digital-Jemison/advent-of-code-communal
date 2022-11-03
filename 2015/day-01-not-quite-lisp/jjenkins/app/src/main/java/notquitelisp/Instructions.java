package notquitelisp;

public class Instructions {

    public static Integer followToFloor(String instuctions) {
        Integer floor = 0;
        char[] chars = instuctions.toCharArray();
        for (char c : chars) {
            switch (c) {
                case '(': {
                    floor++;
                    break;
                }
                case ')': {
                    floor--;
                    break;
                }
            }
        }
        return floor;
    }

    public static Integer instructionsToBasement(String instuctions) {
        Integer floor = 0;
        char[] chars = instuctions.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            switch (c) {
                case '(': {
                    floor++;
                    break;
                }
                case ')': {
                    floor--;
                    break;
                }
            }
            if (floor < 0) {
                return i + 1;
            }
        }
        return floor;
    }
}
