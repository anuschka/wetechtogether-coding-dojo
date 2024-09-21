import org.example.ChristmasTreeKata;
import org.junit.Assert;
import org.junit.Test;

public class ChristmasTreeKataTest {
    @Test
    public void xMasTree1() {
        String[] expected = {"no tree"};
        Assert.assertEquals(expected, ChristmasTreeKata.christmasTree(0));
    }
}
