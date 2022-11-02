import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotQuiteLispTest {
    @Test
    public void emptyFloorZero(){
        NotQuiteLisp notQuiteLisp = new NotQuiteLisp();
        assertEquals(notQuiteLisp.getFloor(""), 0);
    }
    @Test
    public void openBracketIncrements(){
        NotQuiteLisp notQuiteLisp = new NotQuiteLisp();
        assertEquals(notQuiteLisp.getFloor("("), 1);
    }
}
