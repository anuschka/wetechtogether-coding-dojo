import org.example.ChristmasTreeKata;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChristmasTreeKataTest {
    @Test
    public void xMasTree0() {
        List<String> expected = List.of("no tree");
        assertEquals(expected, ChristmasTreeKata.drawChristmasTree(0));
    }

    @Test
    public void xMasTree1() {
        List<String> expected = List.of("x");
        assertEquals(expected, ChristmasTreeKata.drawChristmasTree(1));
    }

    @Test
    public void xMasTree2() {
        List<String> expected = List.of(" x"," x");
        assertEquals(expected, ChristmasTreeKata.drawChristmasTree(2));
    }

    @Test
    public void xMasTree3() {
        List<String> expected = List.of("  x"," xxx","  x");
        assertEquals(expected, ChristmasTreeKata.drawChristmasTree(3));
    }
}
