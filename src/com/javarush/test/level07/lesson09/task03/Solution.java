package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> strlist = new ArrayList<String>();
        strlist.add("мама");
        strlist.add("мыла");
        strlist.add("раму");
        for (int i = 0; i < strlist.size()+1; i++)
        {
            if (i%2 != 0 ) strlist.add(i,"именно");
        }

        for (int i = 0; i < strlist.size(); i++)
        {
            System.out.println(strlist.get(i));
        }



    }
}
