/**
 * Created by Людмила on 16.04.2017.
 */
public class ClassOfExeptions extends Exception {
    private String word;

    public ClassOfExeptions(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "ClassOfExeptions{" +
                "word='" + word + '\'' +
                '}';
    }
}
