import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        try {
            File myObj = new File("src/main/java/data.txt");
            Scanner myReader = new Scanner(myObj);
            if(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(Main.calculateFloor(data));
                System.out.println(Main.calculateCharPosition(data));
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    };

    public static int calculateFloor(String input) {
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

    public static int calculateCharPosition(String input) {
        int counter = 0;
            for (int i = 0; i < input.length(); i++) {
                char ch = input.toCharArray()[i];
                if (ch == '(') {
                    counter++;
                }
                if (ch == ')') {
                    counter--;
                }
                if (counter == -1){
                    return i+1;
                }
            }
            return -1;
    }
}
