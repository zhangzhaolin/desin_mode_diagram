package framework;

/**
 * 模拟电梯打开状态
 *
 * @author zhang
 */
public class OpeningState extends BaseState {
    @Override
    public void run() {
        System.out.println("电梯打开状态不可以运行");
    }

    @Override
    public void stop() {

    }

    @Override
    public void open() {
        System.out.println("电梯开门-----------");
    }

    @Override
    public void close() {
        super.context.setState(Context.CLOSING_STATE);
    }
}
