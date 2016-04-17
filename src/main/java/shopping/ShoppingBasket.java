package shopping;

import domain.Item;
import price.PriceCalculationServiceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket  {

    private final List<BasketItem> items = new ArrayList<>();

    final PriceCalculationServiceImpl priceCalculationService = new PriceCalculationServiceImpl();

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
            totalBasketCost = totalBasketCost.add(priceCalculationService.getDiscountRule(basketItem.getItem().getProduct()).getTotalPrice(basketItem.getQuantity(), basketItem.getItem().getPrice()));
        }

        return totalBasketCost;
    }
}
