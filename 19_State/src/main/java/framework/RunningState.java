package framework;

/**
 * 模拟电梯运行状态
 */
public class RunningState extends BaseState {
    @Override
    public void run() {
        System.out.println("电梯开始跑起来-----------");
    }

    @Override
    public void stop() {
        super.context.setState(Context.STOPPING_STATE);
        System.out.println("电梯停止-----------");
    }

    @Override
    public void open() {
        System.out.println("电梯运行中不能打开");
    }

    @Override
    public void close() {
        System.out.println("电梯关门-----------");

    }
}
