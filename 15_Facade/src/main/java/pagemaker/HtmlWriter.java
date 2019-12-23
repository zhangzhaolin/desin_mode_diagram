package pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {

    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    public HtmlWriter(String path) throws IOException {
        this.writer = new FileWriter(path);
    }

    public void title(String title) throws IOException {
        writer.write("<html>" +
                "<head>" +
                "<meta charset=\"utf-8\">" +
                "<title>" + title + "</title>" +
                "</head>" +
                "<body>" +
                "<h1>" + title + "</h1>");
    }

    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>");
    }

    public void link(String href, String caption) throws IOException {
        writer.write("<a href=\"" + href + "\">" + caption + "</a>");
    }

    public void mailto(String mailAddr, String username) throws IOException {
        link("mailto:" + mailAddr, username);
    }

    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>");
        writer.close();
    }
}
