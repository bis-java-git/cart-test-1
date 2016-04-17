package price;

import java.math.BigDecimal;

public class Buy1Get1FreeRule implements DiscountPriceRule {

    @Override
    public BigDecimal getTotalPrice(Integer quantity, BigDecimal price) {
        Integer discountQuantity = quantity/2;
        Integer discountedRemainingQuantity = quantity % 2;

        return new BigDecimal(discountQuantity + discountedRemainingQuantity).multiply(price);
    }
}
