package com.zsoltfabok.arithmetic.expression.evaluator;

public class NotInDomainException extends Exception
{

    public NotInDomainException()
    {
    }

    public NotInDomainException(String message)
    {
        super(message);
    }

    public NotInDomainException(double x)
    {
        value = x;
    }

    private double value;
}
