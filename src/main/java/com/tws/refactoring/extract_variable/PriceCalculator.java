package com.tws.refactoring.extract_variable;

public class PriceCalculator {

    private static final int DISCOUNT_LIMIT = 500;
    private static final double DISCOUNT_RATE = 0.05;
    private static final double SHIPPING_RATE = 0.1;
    private static final double SHIPPING_MAX = 100.0;

    public double getPrice(int quantity, int itemPrice) {
        int basePrice = quantity * itemPrice;
        double discount = Math.max(0, quantity - DISCOUNT_LIMIT) * itemPrice * DISCOUNT_RATE;
        double shippingCost = Math.min(quantity * itemPrice * SHIPPING_RATE, SHIPPING_MAX);
        return basePrice - discount + shippingCost;
    }
}
