import org.junit.jupiter.api.Test;

public class TestTemplate {
    // PART ONE TESTS
    @Test
    public void upInstructions() {
        Integer outcome = Main.traverseString("(", "one");
        assert(outcome).equals(1);
    }

    @Test
    public void downInstructions() {
        Integer outcome = Main.traverseString(")", "one");
        assert(outcome).equals(-1);
    }

    @Test
    public void multiInstructions() {
        Integer outcome = Main.traverseString("(()(()", "one");
        assert(outcome).equals(2);
    }

    @Test
    public void invalidInstructions() {
        Integer outcome = Main.traverseString("12354dfs", "one");
        assert(outcome).equals(0);
    }

      // PART TWO TESTS
      @Test
      public void firstBasement() {
          Integer position = Main.traverseString(")", "two");
          assert(position).equals(1);
      }

      @Test
      public void detectBasement() {
          Integer position = Main.traverseString("(()))", "two");
          assert(position).equals(5);
      }
}
