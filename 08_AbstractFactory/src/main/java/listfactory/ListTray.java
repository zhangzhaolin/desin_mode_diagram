package listfactory;

import factory.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuffer result = new StringBuffer();
        result.append("<li>");
        result.append(caption).append("\n");
        result.append("<ul>\n");
        tray.forEach(item -> result.append(item.makeHtml()).append("\n"));
        result.append("</ul>\n");
        result.append("</li>\n");
        return result.toString();
    }
}
