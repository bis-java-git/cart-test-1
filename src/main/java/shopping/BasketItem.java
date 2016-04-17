package shopping;

import domain.Item;

import java.math.BigDecimal;

public class BasketItem {

    private final Item item;

    private Integer quantity =1;

    public BasketItem(Item item) {
        this.item=item;
    }

    public void incrementQuantity() {
        quantity++;
    }

    public BigDecimal getTotalPrice() {
        return item.getPrice().multiply(new BigDecimal(quantity));
    }

    public Item getItem() {
        return item;
    }

}
