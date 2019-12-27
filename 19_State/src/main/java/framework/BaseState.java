package framework;

/**
 * 模拟电梯状态中的不同方法
 * @author zhang
 */
public abstract class BaseState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 模拟电梯运行的方法
     */
    public abstract void run();

    /**
     * 模拟电梯停止的方法
     */
    public abstract void stop();

    /**
     * 模拟电梯开门的方法
     */
    public abstract void open();

    /**
     * 模拟电梯关门的方法
     */
    public abstract void close();
}
