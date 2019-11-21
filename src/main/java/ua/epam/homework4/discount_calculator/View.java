package ua.epam.homework4.discount_calculator;

import java.util.Scanner;

class View {
    private ExpensesCalculation expensesCalculation = new ExpensesCalculation();
    private Scanner scanner = new Scanner(System.in);

    void printReceipt() {
        System.out.println("Please enter total amount:");
        String inputString = scanner.nextLine();
        double total;

        if (inputString.matches("\\d+(\\.\\d+)?")) {
            total = Double.parseDouble(inputString);
            System.out.println(expensesCalculation.calculateDiscount(total));
        } else {
            System.out.println("Incorrect input.");
            printReceipt();
        }
    }
}
