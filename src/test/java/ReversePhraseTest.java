import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReversePhraseTest {
    @Before
    public void before() {
        ReverseLetters reversePhrase = new ReversePhrase();
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
        assertEquals("anoineimaZ ćśonjelok 6retil",
                reverseWords.apply("Zamieniona kolejność liter6"));
    }

    @Test
    public void apply_textWithSpaces() {
        assertEquals(" anoineimaZ ćśonjelok retil ",
                reverseWords.apply(" Zamieniona kolejność liter "));
    }

    private ReverseLetters reverseWords;
}
