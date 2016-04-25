package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        boolean isNODfound = false;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(reader.readLine()); //Solution.getIntegerPositiveNumber(reader);
        int n2 = Integer.parseInt(reader.readLine()); //Solution.getIntegerPositiveNumber(reader);

        ArrayList<Integer> delN1 = new ArrayList<>();
        ArrayList<Integer> delN2 = new ArrayList<>();

        for (int i = n1; i > 0; i--)
        {
            if(n1%i == 0) delN1.add(i);
        }

        for (int i = n2; i > 0; i--)
        {
            if(n2%i == 0) delN2.add(i);
        }

        for (int i = 0; i < delN1.size() && isNODfound!=true; i++)
        {
            for (int j = 0; j < delN2.size() && isNODfound!=true; j++)
            {
                if(delN1.get(i)==delN2.get(j)) {System.out.println(delN1.get(i));isNODfound=true;}
            }
        }

    }

    /*static int getIntegerPositiveNumber(BufferedReader reader) throws Exception
    {
        int number;
        while((number = ) < 0 )
        {
            System.out.println("Некорректный ввод.");
        }

        return number;
    }*/
}
