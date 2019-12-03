package framework;

public abstract class Product implements Cloneable {

    Product createClone() throws CloneNotSupportedException {
        return (Product) clone();
    }

    public abstract void use(String letter);

}
