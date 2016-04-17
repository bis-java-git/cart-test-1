package shopping;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class BasketItemTest extends BaseBasketTest {

    private final BasketItem basketItem = new BasketItem(orange);

    @Test
    public void getItemTest() {
        assertNotNull(basketItem.getItem());
    }

    @Test
    public void getTotalPriceTest() {
        assertEquals(ORANGE_PRICE, basketItem.getTotalPrice());
    }

    @Test
    public void incrementQuantityTest() {
        basketItem.incrementQuantity();
        assertEquals(ORANGE_PRICE.multiply(new BigDecimal(2)), basketItem.getTotalPrice());
    }
}
