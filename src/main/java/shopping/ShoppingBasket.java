package shopping;

import domain.Item;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket implements Serializable {

    private static final long serialVersionUID = 1L;

    private final List<BasketItem> items = new ArrayList<>();

    public void addItem(final Item item) {
        for (BasketItem basketItem : items) {
            if (basketItem.getItem().getProduct().equals(item.getProduct())) {
                basketItem.incrementQuantity();
                return;
            }
        }
        items.add(new BasketItem(item));
    }

    public BigDecimal calculateTotalPrice() {
        BigDecimal totalBasketCost = BigDecimal.ZERO;

        for (BasketItem basketItem : items) {
            totalBasketCost = totalBasketCost.add(basketItem.getTotalPrice());
        }

        return totalBasketCost;
    }
}
