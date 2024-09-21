import org.junit.Assert;
import org.junit.Test;

import static org.example.KataFizzBuzzList.fizzBuzz;

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
}
