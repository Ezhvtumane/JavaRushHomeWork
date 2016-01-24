package com.javarush.test.level15.lesson12.home04;

/**
 * Created by lubuntu-v on 24.01.16.
 */
public final class Moon implements Planet
{
    private static final Moon instance = new Moon();

    private Moon(){}

    public static Moon getInstance()
    {
        return instance;
    }
}
