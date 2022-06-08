public class ReversePhrase implements ReverseLetters{
    @Override
    public String apply(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
