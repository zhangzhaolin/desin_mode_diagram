package framework;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Trouble {

    private int num;

    public Trouble(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "framework.Trouble{" +
                "num=" + num +
                '}';
    }
}
