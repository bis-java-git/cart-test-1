package price;

import org.junit.Test;
import shopping.BaseBasketTest;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class Buy1Get1FreeRuleTest extends BaseBasketTest {

    private final DiscountPriceRule discountRule = new Buy1Get1FreeRule();

    @Test
    public void priceZeroItemTest() {
        assertEquals(ORANGE_PRICE.multiply(BigDecimal.ZERO), discountRule.getTotalPrice(0,ORANGE_PRICE));
    }

    @Test
    public void discountedSingleItemTest() {
        assertEquals(ORANGE_PRICE.multiply(BigDecimal.ONE), discountRule.getTotalPrice(1,ORANGE_PRICE));
    }

    @Test
    public void discountedMultipleEvenItemsTest() {
        assertEquals(ORANGE_PRICE.multiply(new BigDecimal(3)), discountRule.getTotalPrice(6,ORANGE_PRICE));
    }

    @Test
    public void discountedMultipleOddItemsTest() {
        assertEquals(ORANGE_PRICE.multiply(new BigDecimal(3)).add(ORANGE_PRICE), discountRule.getTotalPrice(7,ORANGE_PRICE));
    }
}
