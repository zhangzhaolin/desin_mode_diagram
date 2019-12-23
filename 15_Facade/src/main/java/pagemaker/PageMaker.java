package pagemaker;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Properties;

public class PageMaker {

    private PageMaker() {

    }

    public static void makeWelcomePage(String mailAddr, String filename) {
        Properties properties = Database.getProperties("maildata");
        String username = properties.getProperty(mailAddr);
        try {
            String filePath = Paths.get(PageMaker.class.getClassLoader().getResource(filename).toURI()).toString();
            HtmlWriter writer = new HtmlWriter(filePath);
            writer.title("Welcome to" + username + "page");
            writer.paragraph("欢迎来到" + username + "的主页");
            writer.paragraph("等着你的邮件哦！");
            writer.mailto(mailAddr, username);
            writer.close();
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

}
