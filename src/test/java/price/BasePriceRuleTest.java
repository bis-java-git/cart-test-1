package price;

import org.junit.Test;
import shopping.BaseBasketTest;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class BasePriceRuleTest extends BaseBasketTest {

    private final DiscountPriceRule discountPriceRule = new BasePriceRule();

    @Test
    public void basePriceZeroItemTest() {
        assertEquals(ORANGE_PRICE.multiply(BigDecimal.ZERO), discountPriceRule.getTotalPrice(0,ORANGE_PRICE));
    }

    @Test
    public void basePriceSingleItemTest() {
        assertEquals(ORANGE_PRICE.multiply(BigDecimal.ONE), discountPriceRule.getTotalPrice(1,ORANGE_PRICE));
    }

    @Test
    public void basePriceMultipleItemsTest() {
        assertEquals(ORANGE_PRICE.multiply(new BigDecimal(6)), discountPriceRule.getTotalPrice(6,ORANGE_PRICE));
    }
}


