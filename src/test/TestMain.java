import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMain {

    @Test
    public void testAdd() {
        Main main = new Main();
        int result = main.add(2, 3);
        assertEquals(5, result);  // Assert that 2 + 3 equals 5
    }
}
