import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RerverseUppercaseTest {


    @Before
    public void before() {
        ReverseLetters reversePhrase = new RerverseUppercase();
        reverseWords = ReverseWords.with(reversePhrase);
    }

    @Test(expected = IllegalArgumentException.class)
    public void create_withNullReversePhrase() {
        ReverseWords.with(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void apply_null() {
        reverseWords.apply(null);
    }

    @Test
    public void apply_empty() {
        assertEquals("", reverseWords.apply(""));
    }

    @Test
    public void apply_plainText() {
        assertEquals("ANOINEIMAZ ĆŚONJELOK 6RETIL",
                reverseWords.apply("Zamieniona kolejność liter6"));
    }

    @Test
    public void apply_textWithSpaces() {
        assertEquals(" ANOINEIMAZ ĆŚONJELOK RETIL ",
                reverseWords.apply(" Zamieniona kolejność liter "));
    }

    private ReverseLetters reverseWords;
}
