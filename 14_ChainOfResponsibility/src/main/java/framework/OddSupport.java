package framework;

/**
 * 解决奇数标号的问题
 *
 * @author zhang
 */
public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return trouble.getNum() % 2 == 1;
    }
}
