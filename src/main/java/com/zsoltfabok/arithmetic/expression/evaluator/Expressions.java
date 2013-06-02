package com.zsoltfabok.arithmetic.expression.evaluator;

import java.util.Hashtable;

public class Expressions
{

    public Expressions(Hashtable hashExpressions, Hashtable hashContents, double factor)
    {
        this.hashExpressions = hashExpressions;
        this.hashContents = hashContents;
        this.factor = factor;
    }

    public double getResult(String expressionCode)
    {
        StringBuffer expression2 = new StringBuffer();
        String expression = (String)hashExpressions.get(expressionCode);
        int i = 0;
        int lastPoz = 0;
        for(; i < expression.length(); i++)
            if(i == expression.length() - 1 || Operator.isOperator(expression.charAt(i)))
            {
                String element = expression.substring(lastPoz, i);
                if(element.matches(".*[a-zA-Z].*"))
                {
                    if(element.matches("E[0-9]{1,2}"))
                        expression2.append((new Double(getResult(element))).toString());
                    else
                    if(element.equals("n"))
                        expression2.append(new Double(factor));
                    else
                        expression2.append((String)hashContents.get(element));
                } else
                {
                    expression2.append(element);
                }
                lastPoz = i + 1;
                expression2.append(expression.charAt(i));
            }

        return Calculate.evaluate(expression2.toString());
    }

    private Hashtable hashExpressions;
    private Hashtable hashContents;
    private double factor;
}
