package com.zsoltfabok.arithmetic.expression.evaluator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FunctionTest {
    @Test
    public void testSomething() throws NotInDomainException {
        Function function = new Function();
        function.addInterval(new Interval(-5.0, 5.0), "6 * 2");
        assertEquals(12.0, function.getValue(2.0), 0.0);
    }
}
