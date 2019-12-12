package tablefactory;

import factory.Page;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html lang=\"zh\">\n");
        buffer.append(" <head><meta charset='utf-8'><title>").append(title).append("</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>").append(title).append("</h1>\n");

        buffer.append("<table border=\"3\"><tbody width=\"100%\">");

        content.forEach(item -> buffer.append("<tr>").append(item.makeHtml()).append("</tr>"));

        buffer.append("</tbody></table>");

        buffer.append("<hr>\n<address>").append(author).append("</address>\n");
        buffer.append("</body>\n</html>\n");
        return buffer.toString();

    }
}
