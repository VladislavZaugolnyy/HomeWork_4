package ua.epam.homework4.discount_calculator;

import java.util.Date;

class ExpensesCalculation {
    Receipt calculateDiscount(double total) {
        Receipt receipt = new Receipt(total);
        receipt.setDate(new Date());

        if (receipt.getTotal() < 500) {
            receipt.setDiscount(0.05);
            receipt.setAmountToPay(calculateAmountToPay(receipt));
            return receipt;
        } else if (receipt.getTotal() > 499 && receipt.getTotal() < 1001) {
            receipt.setDiscount(0.1);
            receipt.setAmountToPay(calculateAmountToPay(receipt));
            return receipt;
        } else if (receipt.getTotal() > 1000) {
            receipt.setDiscount(0.15);
            receipt.setAmountToPay(calculateAmountToPay(receipt));
            return receipt;
        }
        return receipt;
    }

    private double calculateAmountToPay(Receipt receipt) {
        double amountToPay = Math.round(receipt.getTotal() * (1 - receipt.getDiscount()) * 100) / 100D;
        return amountToPay;
    }
}
