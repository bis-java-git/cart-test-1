package price;

import domain.Product;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class PriceCalculationServiceTest {

    private PriceCalculationService priceCalculationService = new PriceCalculationServiceImpl();

    @Test
    public void  getDiscountRuleTest() {
        assertNotNull(priceCalculationService.getDiscountRule(Product.APPLE));
        assertThat(priceCalculationService.getDiscountRule(Product.APPLE), instanceOf(Buy1Get1FreeRule.class));
        assertThat(priceCalculationService.getDiscountRule(Product.ORANGE), instanceOf(Buy3AndPayFor2Rule.class));
    }
}
