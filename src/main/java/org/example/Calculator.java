package org.example;

public class Calculator {

    public Calculator() {
    }

    public double calculatingDiscount (double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        if (discountAmount < 0) throw new ArithmeticException("DiscountAmount < 0%, please check the value and try again.");
        if (discountAmount > 100) throw new ArithmeticException("DiscountAmount > 100%, please check the value and try again.");
        if (purchaseAmount < 0) throw new ArithmeticException("PurchaseAmount < 0, please check the value and try again.");

        return purchaseAmount * (100 - discountAmount) / 100; // Метод должен возвращать сумму покупки со скидкой

    }
}
