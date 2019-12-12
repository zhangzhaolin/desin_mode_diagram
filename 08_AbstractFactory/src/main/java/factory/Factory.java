package factory;

public abstract class Factory {

    public static Factory getFactory(String classname) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Factory) Class.forName(classname).newInstance();
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
