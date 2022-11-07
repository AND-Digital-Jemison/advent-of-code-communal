public class Main {
    public static void main(String[] args) {
        System.out.println(Main.Program("((()"));
    };

    public static int Program(String input) {
        int counter = 0;

        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                counter++;
            }
            if (ch == ')') {
                counter--;
            }
        } 
        return counter;
    }
}
