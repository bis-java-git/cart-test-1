package price;


import domain.Product;

import java.util.HashMap;
import java.util.Map;

public class PriceCalculationServiceImpl implements PriceCalculationService {

    private Map<Product, DiscountPriceRule> discountRuleMap;

    private DiscountPriceRule basePriceRule = new BasePriceRule();

    public PriceCalculationServiceImpl() {
        discountRuleMap = new HashMap<>();
    }

    public DiscountPriceRule getDiscountRule(Product product) {

        DiscountPriceRule discountPriceRule =  discountRuleMap.get(product);
        if (discountPriceRule==null) {
            return basePriceRule;
        }
        return discountPriceRule;
    }
}
