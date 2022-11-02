public class Main {
    public static void main(String[] args) {
        ReadFile reader = new ReadFile();
        String data = reader.readFile("src/data/index.txt");

        Integer floor = traverseString(data, "one");
        System.out.println(floor);

        Integer basementPosition = traverseString(data, "two");
        System.out.println(basementPosition);

    }

    static Integer traverseString(String str, String part)
    {
        char[] ch = str.toCharArray();
        Integer output = 0;
        Integer position;
 
        for (int i = 0; i < ch.length; i++) {

            output+= ch[i] == '(' ? 1 : -1;
            
            if(output < 0 && part == "two") {
                position = i+1;
                return position;
              }
        }

        return output;
    }


}
