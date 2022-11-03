package notquitelisp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {

    public static String readFile(String path) throws FileNotFoundException {
        File myObj = new File(path);
        Scanner myReader = new Scanner(myObj.getAbsoluteFile());
        String data = "";
        while (myReader.hasNextLine()) {
            data += myReader.nextLine();
        }
        myReader.close();
        return data;
    }
}
