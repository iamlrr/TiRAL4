public class ReverseForceUppercase implements ReverseLetters {
    public String apply(String s) {
        if (!s.chars().allMatch(Character::isLetter)) {
            throw new IllegalArgumentException("tekst nie posiada samych liter i spacji");
        }
        return new StringBuilder(s).reverse().toString().toUpperCase();
    }
}
