package idcard;

import framework.Product;
import lombok.Data;
import lombok.Getter;

import java.util.Objects;

@Getter
public class IDCard implements Product {

    private String owner;
    private String id;

    IDCard(String owner, String id) {
        this.owner = owner;
        this.id = id;
        System.out.println("创建" + owner + "的ID卡.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IDCard idCard = (IDCard) o;
        return Objects.equals(id, idCard.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡.");
    }
}
