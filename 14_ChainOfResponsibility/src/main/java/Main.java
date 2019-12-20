import framework.*;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Support s1 = new NoSupport("s1");
        Support s2 = new LimitSupport("s2", 100);
        Support s3 = new SpecialSupport("s3", 429);
        Support s4 = new LimitSupport("s4", 200);
        Support s5 = new OddSupport("s5");
        Support s6 = new LimitSupport("s6", 300);

        s1.setNext(s2);
        s2.setNext(s3);
        s3.setNext(s4);
        s4.setNext(s5);
        s5.setNext(s6);

        for (int i = 0; i < 500; i += 33) {
            s1.support(new Trouble(i));
        }

    }

}
