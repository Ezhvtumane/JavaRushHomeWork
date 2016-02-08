package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14

javarush.ru/alpha/index.html?lvl=15&??view&&&name=Aobjmigo&obj=3.14&name=&obj=djsdcd&&?oobj=3.0
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String[] sa;


        sa=(s.substring(s.indexOf("?")+1,s.length())).split("&");

        for(int i=0;i<sa.length; i++)
        {
            if(sa[i].contains("="))
            System.out.print(sa[i].substring(0,sa[i].indexOf("=")));
            else
                System.out.print(sa[i].substring(0,sa[i].length()));
//sa[i].indexOf("?")
            System.out.print(" ");
        }

        System.out.println("");

        for(int i=0;i<sa.length; i++)
        {
            if(!sa[i].equals(""))
            if (sa[i].substring(0,3).equals("obj")/*sa[i].contains("obj")*/)
                try
                {
                    alert(Double.parseDouble(sa[i].substring(sa[i].indexOf("=")+1,sa[i].length())));
                }
                catch(Exception e)
                {
                    alert(sa[i].substring(sa[i].indexOf("=")+1,sa[i].length()));
                }
        }



    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
