package framework;

import java.util.HashMap;

public class Manager {

    private HashMap<String, Product> showcase = new HashMap<>();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String protoname) throws CloneNotSupportedException {
        return showcase.get(protoname).getInstance();
    }

}
