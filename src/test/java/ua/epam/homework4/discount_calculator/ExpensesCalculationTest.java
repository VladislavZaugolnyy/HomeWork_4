package ua.epam.homework4.discount_calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExpensesCalculationTest {
    private ExpensesCalculation expensesCalculation = new ExpensesCalculation();

    @Test
    public void shouldReturnAmountToPayWith5PercentDiscount() {
        assertEquals(474.05, expensesCalculation.calculateDiscount(499).getAmountToPay(), 0);
    }

    @Test
    public void shouldReturnAmountToPayWith10PercentDiscount() {
        assertEquals(900, expensesCalculation.calculateDiscount(1000).getAmountToPay(), 0);
    }

    @Test
    public void shouldReturnAmountToPayWith15PercentDiscount() {
        assertEquals(850.85, expensesCalculation.calculateDiscount(1001).getAmountToPay(), 0);
    }
}
