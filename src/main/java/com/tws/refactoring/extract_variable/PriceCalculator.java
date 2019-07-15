package com.tws.refactoring.extract_variable;

public class PriceCalculator {

    public static final int DISCOUNT_LIMIT = 500;
    public static final double DISCOUNT_RATE = 0.05;
    public static final double SHIPPING_RATE = 0.1;
    public static final double SHIPPING_MAX = 100.0;

    double getPrice(int quantity, int itemPrice) {
        int basePrice = quantity * itemPrice;
        double discount = Math.max(0, quantity - DISCOUNT_LIMIT) * itemPrice * DISCOUNT_RATE;
        double shippingCost = Math.min(quantity * itemPrice * SHIPPING_RATE, SHIPPING_MAX);
        return basePrice - discount + shippingCost;
    }
}
