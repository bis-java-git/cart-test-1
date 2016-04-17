package domain;

import java.math.BigDecimal;

public final class Item {

    private final Product product;

    private final BigDecimal Price;

    public Item(Product product, BigDecimal price) {
        this.product = product;
        Price = price;
    }

    public Product getProduct() {
        return product;
    }

    public BigDecimal getPrice() {
        return Price;
    }

}
