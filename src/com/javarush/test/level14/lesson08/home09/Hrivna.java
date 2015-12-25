package com.javarush.test.level14.lesson08.home09;

/**
 * Created by lubuntu-v on 25.12.15.
 */
public class Hrivna extends Money
{
    public Hrivna(double amount)
    {
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        return "HRN";
    }
}
