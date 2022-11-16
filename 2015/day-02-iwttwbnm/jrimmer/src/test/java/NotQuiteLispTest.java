import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotQuiteLispTest {
    private final NotQuiteLisp notQuiteLisp = new NotQuiteLisp();

    @Test
    public void emptyFloorZero(){
        assertEquals(notQuiteLisp.getFloor(""), 0);
    }

    @Test
    public void openBracketIncrements(){
        assertEquals(notQuiteLisp.getFloor("("), 1);
    }

    @Test
    public void closedBracketDecrements(){
        assertEquals(notQuiteLisp.getFloor(")"), -1);
    }

    @Test
    public void variousBracketsIncrementAndDecrement(){
        assertEquals(notQuiteLisp.getFloor("(())("), 1);
    }

    @Test
    public void getFirstBasementIndex(){
        assertEquals(notQuiteLisp.getFirstBasementIndex("(()))"), 5);
    }

    @Test
    public void neverGoesToBasement(){
        assertEquals(notQuiteLisp.getFirstBasementIndex("(())(((("), -1);
    }
}
