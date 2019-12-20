package framework;

/**
 * 仅仅解决编号小于limit的问题
 *
 * @author zhang
 */
public class LimitSupport extends Support {

    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return trouble.getNum() < limit;
    }
}
