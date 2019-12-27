package framework;

/**
 * 模拟电梯停止状态
 *
 * @author zhang
 */
public class StoppingState extends BaseState {
    @Override
    public void run() {
        super.context.setState(Context.RUNNING_STATE);
        System.out.println("电梯开始跑起来-----------");
    }

    @Override
    public void stop() {
        System.out.println("电梯停止-----------");
    }

    @Override
    public void open() {
        super.context.setState(Context.OPENING_STATE);
        System.out.println("电梯开门-----------");
    }

    @Override
    public void close() {
        super.context.setState(Context.CLOSING_STATE);
        System.out.println("电梯关门-----------");
    }
}
