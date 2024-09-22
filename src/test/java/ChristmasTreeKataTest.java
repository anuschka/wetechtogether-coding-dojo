import org.example.ChristmasTreeKata;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ChristmasTreeKataTest {
    @Test
    public void xMasTree0() {
        List<String> expected = List.of("no tree");
        Assert.assertEquals(expected, ChristmasTreeKata.drawChristmasTree(0));
    }

    @Test
    public void xMasTree1() {
        List<String> expected = List.of("x");
        Assert.assertEquals(expected, ChristmasTreeKata.drawChristmasTree(1));
    }

    @Test
    public void xMasTree2() {
        List<String> expected = List.of(" x"," x");
        Assert.assertEquals(expected, ChristmasTreeKata.drawChristmasTree(2));
    }

    @Test
    public void xMasTree3() {
        List<String> expected = List.of("  x"," xxx","  x");
        Assert.assertEquals(expected, ChristmasTreeKata.drawChristmasTree(3));
    }
}
