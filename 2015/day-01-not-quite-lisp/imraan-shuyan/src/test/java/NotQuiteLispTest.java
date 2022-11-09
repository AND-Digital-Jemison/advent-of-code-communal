import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NotQuiteLispTest {
    @Test
    @DisplayName("given an empty string returns 0")
    void testEmptyString() {
        String input = "0";
        int result = Main.calculateFloor(input);
        assertEquals(0, result);
    }

    @Test
    @DisplayName("given a single open bracket returns 1")
    void testSingleOpenBracket() {
        String input = "(";
        int expected = 1;
        int result = Main.calculateFloor(input);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("given a single close bracket returns -1")
    void testSingleCloseBracket() {
        String input = ")";
        int expected = -1;
        int result = Main.calculateFloor(input);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("given two open brackets returns 2")
    void testOpenBrackets() {
        String input = "((";
        int expected = 2;
        int result = Main.calculateFloor(input);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("when enter the basement returns the the character position")
    void testBasementCharacterPosition() {
        String input = ")";
        int expected = 1;
        int result = Main.calculateCharPosition(input);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("when you enter the basement returns -1")
    void testNeverReachBasement() {
        String input = "((((((";
        int expected = -1;
        int result = Main.calculateCharPosition(input);
        assertEquals(expected, result);
    }

}
