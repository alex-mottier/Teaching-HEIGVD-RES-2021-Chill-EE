package ch.heigvd.res.chill.domain.alexmottier;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class SWAF implements IProduct {

    public final static String NAME = "SWAF";
    public final static BigDecimal PRICE = new BigDecimal(3.4);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }

}