import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.example.KataFizzBuzzList.fizzBuzz;
import static org.example.KataFizzBuzzList.fizzBuzzStage2;

public class KataFizzBuzzListTest {
    @Test
    public void fizzBuzzTest() {
        Assert.assertEquals("1", fizzBuzz(100).get(0));
        Assert.assertEquals("2", fizzBuzz(100).get(1));
        Assert.assertEquals("Fizz", fizzBuzz(100).get(2));
        Assert.assertEquals("4", fizzBuzz(100).get(3));
        Assert.assertEquals("Buzz", fizzBuzz(100).get(4));
        Assert.assertEquals("Fizz", fizzBuzz(100).get(5));
        Assert.assertEquals("7", fizzBuzz(100).get(6));
        Assert.assertEquals("8", fizzBuzz(100).get(7));
        Assert.assertEquals("Fizz", fizzBuzz(100).get(8));
        Assert.assertEquals("Buzz", fizzBuzz(100).get(9));
        Assert.assertEquals("11", fizzBuzz(100).get(10));
        Assert.assertEquals("Fizz", fizzBuzz(100).get(11));
        Assert.assertEquals("13", fizzBuzz(100).get(12));
        Assert.assertEquals("14", fizzBuzz(100).get(13));
        Assert.assertEquals("FizzBuzz", fizzBuzz(100).get(14));
        Assert.assertEquals("16", fizzBuzz(100).get(15));
    }

    @Test
    public void testFizzBuzzStage2() {
        // Test input for n = 16
        List<String> result = fizzBuzzStage2(16);

        // Expected result for n = 16
        List<String> expected = List.of(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz", "14", "FizzBuzz", "16"
        );

        // Assert that the result matches the expected list
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFizz() {
        // Test for numbers that should return "Fizz"
        Assert.assertEquals(List.of("1","2","Fizz"), fizzBuzzStage2(3));
        Assert.assertEquals(List.of("1","2","Fizz", "4", "Buzz", "Fizz"), fizzBuzzStage2(6));
    }

    @Test
    public void testBuzz() {
        // Test for numbers that should return "Buzz"
        Assert.assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), fizzBuzzStage2(5));
    }

    @Test
    public void testFizzBuzz() {
        // Test for numbers divisible by both 3 and 5
        List<String> result = fizzBuzzStage2(15);
        Assert.assertEquals("FizzBuzz", result.get(14)); // 15th element (index 14) should be "FizzBuzz"
    }

    @Test
    public void testNumbersContaining3or5() {
        // Test for numbers that contain '3' or '5' and return "Fizz" or "Buzz"
        List<String> result = fizzBuzzStage2(13);
        Assert.assertEquals("Fizz", result.get(12)); // 13 contains '3', so it should be "Fizz"

        result = fizzBuzzStage2(15);
        Assert.assertEquals("FizzBuzz", result.get(14)); // 15 is divisible by both 3 and 5
    }
}
