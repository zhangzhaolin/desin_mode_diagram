import java.util.Arrays;

public class BigString {

    private BigChar[] bigChars;

    public BigString(String str) {
        bigChars = new BigChar[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bigChars[i] = BigCharFactory.INSTANCE.getBigChar(str.charAt(i));
        }
    }

    public void print() {
        Arrays.stream(bigChars).forEach(BigChar::print);
    }

}
