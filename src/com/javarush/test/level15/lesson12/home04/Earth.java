package com.javarush.test.level15.lesson12.home04;

/**
 * Created by lubuntu-v on 24.01.16.
 */
public final class Earth implements Planet
{
    private static Earth instance;

    private Earth(){}

    public static Earth getInstance()
    {
        if(instance == null)
        {
            instance = new Earth();
        }

        return instance;
    }
}
