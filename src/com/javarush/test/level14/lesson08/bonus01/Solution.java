package com.javarush.test.level14.lesson08.bonus01;

import java.io.*;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            int i[] = {};
            int a=i[8];
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            int i[] = null;
            int a=i[8];
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            int i[] = {Integer.parseInt("hjkh5355")};
            int a=i[8];
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            String s = "ddaada";
            String a =s.substring(10,20);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            ArrayList test = new ArrayList();
            test.get(-10);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            ArrayList test = new ArrayList();
            test.get(10);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            LinkedList l = new LinkedList();
            l.pop();
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("adasdd"));
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new IOException();
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here

    }
}
