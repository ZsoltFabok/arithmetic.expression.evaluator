package com.zsoltfabok.arithmetic.expression.evaluator;

import static org.junit.Assert.assertEquals;
import java.util.Hashtable;
import org.junit.Test;

public class ExpressionsTest {
    @Test
    public void shouldReturnTheSumOfTwoNumber() {
        Hashtable table = new Hashtable();
        table.put("expression", "6 + 2");
        Expressions expressions = new Expressions(table, null, 0);
        assertEquals(8.0, expressions.getResult("expression"), 0.0);
    }
}