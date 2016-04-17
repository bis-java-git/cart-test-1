package shopping;

import domain.Item;
import domain.Product;

import java.math.BigDecimal;

public abstract class BaseBasketTest {

    public static final BigDecimal ORANGE_PRICE = new BigDecimal(25);

    public final Item orange = new Item(Product.ORANGE, ORANGE_PRICE);

    public static final BigDecimal APPLE_PRICE = new BigDecimal(60);

    public final Item apple = new Item(Product.APPLE, APPLE_PRICE);



}
