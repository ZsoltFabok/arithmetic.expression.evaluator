package com.zsoltfabok.wrapper;

import java.util.Hashtable;

import com.zsoltfabok.arithmetic.expression.evaluator.Expressions;

public class Arithmetic {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("expression", args[0]);
        Expressions expressions = new Expressions(table, null, 0);
        System.out.println(expressions.getResult("expression"));
    }
}
