package idcard;

import framework.Factory;
import framework.Product;

import java.util.*;

public class CardFactory extends Factory {

    private Map<String, String> numberOwners = new HashMap<>();

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner, UUID.randomUUID().toString());
    }

    @Override
    public void registerProduct(Product product) {
        numberOwners.put(((IDCard) product).getId(), ((IDCard) product).getOwner());
    }

    public Map<String, String> getNumberOwners() {
        return numberOwners;
    }
}
