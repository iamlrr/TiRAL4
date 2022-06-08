public class RerverseUppercase implements ReverseLetters{
    @Override
    public String apply(String s) {
        return new StringBuilder(s).reverse().toString().toUpperCase();
    }
}
