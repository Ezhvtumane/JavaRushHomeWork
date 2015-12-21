package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Читаем имя файла
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String count="";
        BufferedReader in = new BufferedReader(new FileReader(fileName));

        ArrayList<Integer> list = new ArrayList<>();
        count=in.readLine();

        while(count != null)
        {
            list.add(Integer.parseInt(count));
            count=in.readLine();
        }

        ArrayList<Integer> div2 = new ArrayList();

        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i)%2==0) div2.add(list.get(i));
        }

        Collections.sort(div2);

        for (Integer i: div2)
        {
            System.out.println(i);
        }




    }
}
