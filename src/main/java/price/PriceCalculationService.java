package price;

import domain.Product;

public interface PriceCalculationService {

    DiscountPriceRule getDiscountRule(Product product);
}
