package price;

import java.math.BigDecimal;

public class BasePriceRule implements DiscountPriceRule {

    @Override
    public BigDecimal getTotalPrice(Integer quantity, BigDecimal price) {
        return price.multiply(new BigDecimal(quantity));
    }
}
