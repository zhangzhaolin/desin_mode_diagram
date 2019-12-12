package factory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public abstract class Page {

    protected String title;
    protected String author;
    protected String suffix = ".html";
    protected ArrayList<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Page(String title, String author, String suffix) {
        this.title = title;
        this.author = author;
        this.suffix = suffix;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() throws IOException, URISyntaxException {
        String filename = title + suffix;
        File file = new File(Page.class.getResource("/").toURI().getPath() + "/" + filename);
        if (!file.exists()) {
            file.createNewFile();
        }
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
        writer.write(makeHtml());
        writer.close();
        System.out.println(filename + "编写完成");
    }

    abstract public String makeHtml();
}
