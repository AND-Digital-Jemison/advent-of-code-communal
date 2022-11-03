package notquitelisp;

import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) {

        try {
            String fileData = Utils.readFile("app/data/instructions.txt");
            System.out.printf("\nFollowed instructions to floor: %s", Instructions.followToFloor(fileData));
            System.out.printf("\nReached basement in %s steps", Instructions.instructionsToBasement(fileData));
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
