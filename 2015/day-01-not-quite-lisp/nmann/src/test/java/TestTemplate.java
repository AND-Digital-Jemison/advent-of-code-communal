import org.junit.jupiter.api.Test;

public class TestTemplate {
    // PART ONE TESTS
    @Test
    public void upInstructions() {
        Integer outcome = Instructions.partOne("(");
        assert (outcome).equals(1);
    }

    @Test
    public void downInstructions() {
        Integer outcome = Instructions.partOne(")");
        assert (outcome).equals(-1);
    }

    @Test
    public void multiInstructions() {
        Integer outcome = Instructions.partOne("(()(()");
        assert (outcome).equals(2);
    }

    @Test
    public void invalidInstructions() {
        Integer outcome = Instructions.partOne("12354dfs");
        assert (outcome).equals(0);
    }

    // PART TWO TESTS
    @Test
    public void firstBasement() {
        Integer position = Instructions.partTwo(")");
        assert (position).equals(1);
    }

    @Test
    public void detectBasement() {
        Integer position = Instructions.partTwo("(()))");
        assert (position).equals(5);
    }
}
