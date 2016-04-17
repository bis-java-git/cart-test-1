package price;

import org.junit.Test;
import shopping.BaseBasketTest;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class Buy3AndPayFor2RuleTest extends BaseBasketTest {


    private final DiscountPriceRule discountRule = new Buy3AndPayFor2Rule();

    @Test
    public void priceZeroItemTest() {
        assertEquals(ORANGE_PRICE.multiply(BigDecimal.ZERO), discountRule.getTotalPrice(0,ORANGE_PRICE));
    }

    @Test
    public void discountedSingleItemTest() {
        assertEquals(ORANGE_PRICE.multiply(BigDecimal.ONE), discountRule.getTotalPrice(1,ORANGE_PRICE));
        assertEquals(ORANGE_PRICE.multiply(new BigDecimal(2)), discountRule.getTotalPrice(2,ORANGE_PRICE));
    }

    @Test
    public void discountedMultipleEvenItemsTest() {
        assertEquals(ORANGE_PRICE.multiply(new BigDecimal(4)), discountRule.getTotalPrice(6,ORANGE_PRICE));
    }

    @Test
    public void discountedMultipleOddItemsTest() {
        assertEquals(ORANGE_PRICE.multiply(new BigDecimal(4)).add(ORANGE_PRICE), discountRule.getTotalPrice(7,ORANGE_PRICE));
    }
}
