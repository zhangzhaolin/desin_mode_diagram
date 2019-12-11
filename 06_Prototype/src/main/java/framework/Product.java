package framework;

public abstract class Product implements Cloneable {

    protected Product createClone() throws CloneNotSupportedException {
        return (Product) clone();
    }

    public abstract void use(String letter);

}
