import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;

public class ReverseWords implements ReverseLetters {

    public static ReverseWords with(final ReverseLetters reversePhrase) {
        return new ReverseWords(reversePhrase);
    }

    @Override
    public String apply(final String sentence) {
        if(sentence == null) {
            throw new IllegalArgumentException("Null nie jest dobrym argumentem.");
        }
        final Iterable<String> words = Splitter.on(' ').split(sentence);
        return Joiner.on(' ').join(Iterables.transform(words, reversePhrase));
    }

    private ReverseWords(final ReverseLetters reversePhrase) {
        Preconditions.checkArgument(reversePhrase != null);
        this.reversePhrase = reversePhrase;
    }

    private final ReverseLetters reversePhrase;
}
