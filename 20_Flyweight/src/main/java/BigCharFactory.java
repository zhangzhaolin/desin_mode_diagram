import java.util.HashMap;

public class BigCharFactory {

    private HashMap<String, BigChar> pool = new HashMap<>();

    public static final BigCharFactory INSTANCE = new BigCharFactory();

    private BigCharFactory() {

    }

    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = pool.get(charname + "");
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put(charname + "", bc);
        }
        return bc;
    }

}
