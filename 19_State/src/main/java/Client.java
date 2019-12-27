import framework.ClosingState;
import framework.Context;
import framework.RunningState;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ClosingState());
        context.run().open().close();

        System.out.println("+++++++++++");

        Context context1 = new Context();
        context1.setState(new RunningState());
        context1.stop().open().run().open();

    }

}
