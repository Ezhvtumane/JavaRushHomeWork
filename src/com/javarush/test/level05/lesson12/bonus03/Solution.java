package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.ArrayList;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        ArrayList<Integer> arrInt = new ArrayList<Integer>();



        for (int i = 0; i < N; i++)
        {
            arrInt.add(Integer.parseInt(reader.readLine()));
        }
        int maximum = arrInt.get(0);

        for (int i = 0; i < arrInt.size(); i++)
        {
            if(maximum < arrInt.get(i))
                maximum=arrInt.get(i);
        }




        System.out.println(maximum);
    }
}
