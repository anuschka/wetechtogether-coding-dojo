import org.example.NumberToWords;
import org.junit.Assert;
import org.junit.Test;

public class NumberToWordsTest {
    @Test
    public void convertNumbersToWords() {
        Assert.assertEquals("zero", NumberToWords.convertNumberToWords(0));
        Assert.assertEquals("one", NumberToWords.convertNumberToWords(1));
        Assert.assertEquals("twenty", NumberToWords.convertNumberToWords(20));
        Assert.assertEquals("thirty five", NumberToWords.convertNumberToWords(35));
        Assert.assertEquals("four hundred and twenty one", NumberToWords.convertNumberToWords(421));
        Assert.assertEquals("five hundred and fifty five", NumberToWords.convertNumberToWords(555));
        Assert.assertEquals("six hundred and seventy four", NumberToWords.convertNumberToWords(674));

    }
}
