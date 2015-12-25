package com.javarush.test.level14.lesson08.home03;

public interface Person
{
    public static class User implements Person
    {
        static void live()
        {
            System.out.println("Usually I just live");
        }
    }

    public static class Looser implements Person
    {
        static void doNothing()
        {
            System.out.println("Usually I do nothing");
        }
    }

    public static class Coder implements Person
    {
        static void coding()
        {
            System.out.println("Usually I create code");
        }
    }

    public static class Proger implements Person
    {
        static void enjoy()
        {
            System.out.println("Wonderful life!");
        }
    }

}
