package listfactory;

import factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html lang=\"zh\">\n");
        buffer.append(" <head><meta charset='utf-8'><title>").append(title).append("</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>").append(title).append("</h1>\n");
        buffer.append("<ul>\n");
        content.forEach(item -> buffer.append(item.makeHtml()).append("\n"));
        buffer.append("</ul>\n");
        buffer.append("<hr>\n<address>").append(author).append("</address>\n");
        buffer.append("</body>\n</html>\n");
        return buffer.toString();
    }
}
