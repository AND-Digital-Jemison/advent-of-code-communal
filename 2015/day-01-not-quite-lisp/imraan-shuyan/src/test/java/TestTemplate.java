import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestTemplate {
    @Test
    public void given_a_empty_string_returns_0() {
        String input = "";
        int result = Main.Program(input);
        assertEquals(0, result);
    }

    @Test
    public void given_a_single_open_bracket_returns_1() {
        String input = "(";
        int expected = 1;
        int result = Main.Program(input);
        assertEquals(expected, result);
    }
}
