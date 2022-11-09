
public class Instructions {

  public static Integer partOne(String str) {
    char[] ch = str.toCharArray();
    Integer output = 0;

    for (int i = 0; i < ch.length; i++) {

      output += ch[i] == '(' ? 1 : ch[i] == ')' ? -1 : 0;

    }

    return output;
  }

  public static Integer partTwo(String str) {
    char[] ch = str.toCharArray();
    Integer output = 0;
    Integer position;

    for (int i = 0; i < ch.length; i++) {

      output += ch[i] == '(' ? 1 : ch[i] == ')' ? -1 : 0;
      if (output < 0) {
        position = i + 1;
        return position;
      }

    }

    return 0;
  }

  // static Integer followInstructions(String instructions, C onStep) {
  // char[] ch = instructions.toCharArray();
  // Stream stream = Arrays.stream(instructions.toCharArray());
  // for (char c : ch) {
  // onStep(c)
  // }
  // }
}
