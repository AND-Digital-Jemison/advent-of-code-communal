public class NotQuiteLisp {
    public int getFloor(String input){
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                count++;
            }
            if (input.charAt(i) == ')') {
                count--;
            }
        }

        return count;
    }

    public int getFirstBasementIndex(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                count++;
            }
            if (input.charAt(i) == ')') {
                count--;
            }

            if (count == -1) {
                return i + 1;
            }
        }

        return -1;
    }
}
