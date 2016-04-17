package shopping;

import domain.Item;
import domain.Product;

import java.math.BigDecimal;

public abstract class BaseBasketTest {

    public static final BigDecimal ORANGE_PRICE = new BigDecimal(25);

    public final Item orange = new Item(Product.ORANGE, ORANGE_PRICE);

}
