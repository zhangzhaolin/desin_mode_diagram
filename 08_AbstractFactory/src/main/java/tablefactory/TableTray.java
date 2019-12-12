package tablefactory;

import factory.Tray;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>");
        buffer.append("<table width=\"100%\" border=\"3\">");

        buffer.append("<tr>");
        buffer.append("<td colspan=\"" + tray.size() + "\"><b>").append(caption).append("</b></td>");
        buffer.append("</tr>");

        buffer.append("<tr>");
        tray.forEach(item -> buffer.append(item.makeHtml()));
        buffer.append("</tr>");

        buffer.append("</table>");
        buffer.append("</td>");
        return buffer.toString();
    }
}
