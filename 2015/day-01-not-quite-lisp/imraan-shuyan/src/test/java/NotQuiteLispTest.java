import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NotQuiteLispTest {
    @Test
    @DisplayName("given an empty string returns 0")
    void testEmptyString() {
        String input = "";
        int result = Main.Program(input);
        assertEquals(0, result);
    }

    @Test
    @DisplayName("given a single open bracket returns 1")
    void testSingleOpenBracket() {
        String input = "(";
        int expected = 1;
        int result = Main.Program(input);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("given a single close bracket returns -1")
    void testSingleCloseBracket() {
        String input = ")";
        int expected = -1;
        int result = Main.Program(input);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("given two open brackets returns 2")
    void testOpenBrackets() {
        String input = "((";
        int expected = 2;
        int result = Main.Program(input);
        assertEquals(expected, result);
    }
}
