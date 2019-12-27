package framework;

public class Context {

    public static final ClosingState CLOSING_STATE = new ClosingState();
    public static final FaultState FAULT_STATE = new FaultState();
    public static final OpeningState OPENING_STATE = new OpeningState();
    public static final RunningState RUNNING_STATE = new RunningState();
    public static final StoppingState STOPPING_STATE = new StoppingState();

    private BaseState state;

    public BaseState getState() {
        return state;
    }

    public void setState(BaseState state) {
        this.state = state;
        this.state.setContext(this);
    }

    /**
     * 模拟电梯的运行方法
     */
    public Context run() {
        this.state.run();
        return this;
    }

    /**
     * 模拟电梯的停止方法
     */
    public Context stop() {
        this.state.stop();
        return this;
    }

    /**
     * 模拟电梯的开门方法
     */
    public Context open() {
        this.state.open();
        return this;
    }

    /**
     * 模拟电梯的关门方法
     */
    public Context close() {
        this.state.close();
        return this;
    }
}
