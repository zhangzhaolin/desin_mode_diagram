import factory.Factory;
import factory.Page;
import factory.Tray;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {
        try {
            Factory factory = Factory.getFactory("tablefactory.TableFactory");

            Tray traynews = factory.createTray("日报");
            traynews.add(factory.createLink("人民日报", ""));
            traynews.add(factory.createLink("光明日报", ""));

            Tray search = factory.createTray("搜索引擎");

            Tray yahoo = factory.createTray("yahoo");
            yahoo.add(factory.createLink("yahoo", ""));
            yahoo.add(factory.createLink("yahoo china", ""));
            search.add(yahoo);

            search.add(factory.createLink("baidu", ""));
            search.add(factory.createLink("google", ""));

            Page page = factory.createPage("LinkPage", "shiwazi");

            page.add(traynews);
            page.add(search);

            page.output();

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

}
