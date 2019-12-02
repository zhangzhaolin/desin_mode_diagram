package framework;

public abstract class Product implements Cloneable {

    public abstract void use(String str);

    protected Product getInstance() throws CloneNotSupportedException {
        return (Product) clone();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
