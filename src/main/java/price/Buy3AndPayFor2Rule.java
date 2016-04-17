package price;

import java.math.BigDecimal;

public class Buy3AndPayFor2Rule implements DiscountPriceRule{

    @Override
    public BigDecimal getTotalPrice(Integer quantity, BigDecimal price) {
        Integer discountQuantity = quantity/3;
        Integer discountedRemainingQuantity = quantity % 3;

        return price.multiply(new BigDecimal(discountQuantity *2 )).add(price.multiply(new BigDecimal(discountedRemainingQuantity)));
    }
}
