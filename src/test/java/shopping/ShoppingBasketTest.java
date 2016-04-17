package shopping;

import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.Assert.assertEquals;

public class ShoppingBasketTest extends BaseBasketTest {

    private final ShoppingBasket shoppingBasket = new ShoppingBasket();

    @Test
    public void multipleItemsCalculateTotalPriceTest() {
        shoppingBasket.addItem(orange);
        shoppingBasket.addItem(orange);
        shoppingBasket.addItem(orange);
        shoppingBasket.addItem(orange);
        assertEquals(ORANGE_PRICE.multiply(new BigDecimal(4)), shoppingBasket.calculateTotalPrice());

        shoppingBasket.addItem(apple);
        shoppingBasket.addItem(apple);
        shoppingBasket.addItem(apple);
        shoppingBasket.addItem(apple);
        assertEquals(ORANGE_PRICE.multiply(new BigDecimal(4)).add(APPLE_PRICE.multiply(new BigDecimal(4))), shoppingBasket.calculateTotalPrice());
    }

    @Test
    public void emptyBasketTest() {
        assertEquals(BigDecimal.ZERO, shoppingBasket.calculateTotalPrice());
    }

    @Test
    public void singleItemCalculateTotalPriceTest() {
        shoppingBasket.addItem(orange);
        assertEquals(shoppingBasket.calculateTotalPrice(), ORANGE_PRICE);
    }
}
