package price;

import java.math.BigDecimal;

public interface DiscountPriceRule {

    BigDecimal getTotalPrice(Integer quantity, BigDecimal price);
}
