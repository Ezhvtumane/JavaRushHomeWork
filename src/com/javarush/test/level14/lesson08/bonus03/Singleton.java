package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by ubuntu on 26.04.16.
 */
public class Singleton
{

    private static Singleton singleton;

    private Singleton()
    {
        singleton = new Singleton();
    }

    public static Singleton getInstance()
    {
        return singleton;
    }
}
