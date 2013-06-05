package com.zsoltfabok.arithmetic.expression.evaluator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculateTest {
    @Test
    public void shouldReturnTheFloatVersionOfASingleNumber() {
        assertEquals(4.0, Calculate.evaluate("4"), 0.0);
    }

    @Test
    public void shouldReturnTheSumOfTwoNumber() {
        assertEquals(6.0, Calculate.evaluate("4+2"), 0.0);
    }
}