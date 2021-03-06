package shopping;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigDecimal;
import java.util.Collection;

import static java.util.Arrays.asList;
import static junit.framework.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MultipleItemsShoppingBasketTest extends BaseBasketTest {

    private final ShoppingBasket shoppingBasket = new ShoppingBasket();

    private Integer numberOfItems;

    private BigDecimal totalBasketPrice;

    public MultipleItemsShoppingBasketTest(final Integer numberOfItems,
                                                       final BigDecimal totalBasketPrice) {
        this.numberOfItems = numberOfItems;
        this.totalBasketPrice = totalBasketPrice;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return asList(new Object[][]{
                {0, ORANGE_PRICE.add(APPLE_PRICE).multiply(new BigDecimal(0))},
                {1, ORANGE_PRICE.add(APPLE_PRICE).multiply(new BigDecimal(1))},
                {5, new BigDecimal(280)},
                {10, new BigDecimal(475)},
                {20, new BigDecimal(950)},
                {25, new BigDecimal(1205)},
                {30, new BigDecimal(1400)}
        });
    }

    @Test
    public void multipleItemsCalculateTotalPriceTest() {
        for (Integer count = 0; count < numberOfItems; count++) {
            shoppingBasket.addItem(orange);
            shoppingBasket.addItem(apple);
        }
        assertEquals(totalBasketPrice.setScale(0, BigDecimal.ROUND_HALF_DOWN),
                shoppingBasket.calculateTotalPrice().setScale(0, BigDecimal.ROUND_HALF_DOWN));
    }
}
