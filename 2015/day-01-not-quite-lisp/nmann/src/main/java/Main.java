public class Main {
    public static void main(String[] args) {
        ReadFile reader = new ReadFile();
        String data = reader.readFile("src/data/index.txt");

        Integer floor = Instructions.partOne(data);
        System.out.println(floor);

        Integer basementPosition = Instructions.partTwo(data);
        System.out.println(basementPosition);

    }
}