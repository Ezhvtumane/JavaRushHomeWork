package com.javarush.test.level14.lesson08.home05;

/**
 * Created by lubuntu-v on 24.12.15.
 */
public class Monitor implements CompItem
{
    @Override
    public String getName()
    {
        //return "Monitor";
        return this.getClass().getSimpleName();
    }
}
