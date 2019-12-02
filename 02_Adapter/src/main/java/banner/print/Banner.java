package banner.print;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Banner<T> {

    private T value;

    /**
     * @return (value)
     */
    public String showWithParen() {
        return "(" + value + ")";
    }

    /**
     * @return *value*
     */
    public String showWithAster() {
        return "*" + value + "*";
    }

}
