import org.example.NumberToWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumberToWordsTest {
    @Test
    public void convertNumbersToWords() {
        assertEquals("zero", NumberToWords.convertNumberToWords(0));
        assertEquals("one", NumberToWords.convertNumberToWords(1));
        assertEquals("twenty", NumberToWords.convertNumberToWords(20));
        assertEquals("thirty five", NumberToWords.convertNumberToWords(35));
        assertEquals("four hundred and twenty one", NumberToWords.convertNumberToWords(421));
        assertEquals("five hundred and fifty five", NumberToWords.convertNumberToWords(555));
        assertEquals("six hundred and seventy four", NumberToWords.convertNumberToWords(674));

    }
}
