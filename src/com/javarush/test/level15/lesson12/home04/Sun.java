package com.javarush.test.level15.lesson12.home04;

/**
 * Created by lubuntu-v on 24.01.16.
 */
public final class Sun implements Planet
{
    private static Sun instance;

    private Sun(){}

    public static Sun getInstance()
    {
        if(instance == null){
            instance = new Sun();}

        return instance;
    }
}

