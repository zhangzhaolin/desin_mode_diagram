package framework;

/**
 * 模拟电梯关闭的状态
 */
public class ClosingState extends BaseState {
    @Override
    public void run() {
        super.context.setState(Context.RUNNING_STATE);
        System.out.println("电梯开始跑起来-----------");
    }

    /**
     * 模拟电梯的停止方法
     */
    @Override
    public void stop() {
        super.context.setState(Context.STOPPING_STATE);
        System.out.println("电梯停止-----------");
    }

    /**
     * 模拟电梯的开门方法
     */
    @Override
    public void open() {
        super.context.setState(Context.OPENING_STATE);
        System.out.println("电梯开门-----------");
    }

    /**
     * 模拟电梯的关门方法
     */
    @Override
    public void close() {
        System.out.println("电梯关门-----------");
    }
}
