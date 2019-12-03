import framework.Builder;

import java.util.Arrays;

public class TextBuilder extends Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void buildTitle(String title) {
        buffer.append("===================================\n");
        buffer.append("『").append(title).append("』\n");
        buffer.append("\n");
    }

    @Override
    public void buildString(String str) {
        buffer.append("❄ ").append(str);
        buffer.append("\n");
    }

    @Override
    public void buildItems(String[] items) {
        Arrays.stream(items).forEach(item -> buffer.append(" ▶ ").append(item).append("\n"));
    }

    @Override
    public void buildDone() {
        buffer.append("===================================\n");
    }

    public StringBuffer getResult() {
        return buffer;
    }
}
