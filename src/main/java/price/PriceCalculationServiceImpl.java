package price;


import domain.Product;

import java.util.HashMap;
import java.util.Map;

public class PriceCalculationServiceImpl implements PriceCalculationService {

    private Map<Product, DiscountPriceRule> discountRuleMap =  new HashMap<>();

    private DiscountPriceRule basePriceRule = new BasePriceRule();

    public PriceCalculationServiceImpl() {
        discountRuleMap.put(Product.APPLE, new Buy1Get1FreeRule());
        discountRuleMap.put(Product.ORANGE, new Buy3AndPayFor2Rule());
    }

    public DiscountPriceRule getDiscountRule(Product product) {

        DiscountPriceRule discountPriceRule =  discountRuleMap.get(product);
        if (discountPriceRule==null) {
            return basePriceRule;
        }
        return discountPriceRule;
    }
}
