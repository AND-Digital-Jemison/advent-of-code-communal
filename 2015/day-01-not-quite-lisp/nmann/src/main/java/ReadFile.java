import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 

public class ReadFile {
  public String readFile(String path) {
    String output = "";
    try {
      String newPath = new File(path).getAbsolutePath();
      File myObj = new File(newPath);
      Scanner myReader = new Scanner(myObj);

      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        output+=data;
      }
      myReader.close();
      return output;
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      return output;

    }
  }
}