public class NotQuiteLisp {
    public int getFloor(String input){
        int count = 0;
        if (input == "(") {
            count++;
        }
        return count;
    }
}
