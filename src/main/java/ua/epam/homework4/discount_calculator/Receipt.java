package ua.epam.homework4.discount_calculator;

import java.util.Date;

public class Receipt {
    private Date date;
    private double total;
    private double discount;
    private double amountToPay;

    Receipt(double total) {
        this.total = total;
    }

    double getDiscount() {
        return discount;
    }

    double getTotal() {
        return total;
    }

    double getAmountToPay() {
        return amountToPay;
    }

    void setAmountToPay(double amountToPay) {
        this.amountToPay = amountToPay;
    }

    void setDiscount(double discount) {
        this.discount = discount;
    }

    void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Receipt:" +
                "\nDate: " + date +
                "\nMoney to spend: " + total +
                "\nDiscount: " + (int)(discount * 100) + "%" +
                "\nAmount to pay: " + amountToPay;
    }
}
