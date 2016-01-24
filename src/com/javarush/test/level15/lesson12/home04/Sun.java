package com.javarush.test.level15.lesson12.home04;

/**
 * Created by lubuntu-v on 24.01.16.
 */
public final class Sun implements Planet
{
    private static final Sun instance = new Sun();

    private Sun(){}

    public static Sun getInstance()
    {
        return instance;
    }
}

