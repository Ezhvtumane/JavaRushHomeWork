package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream op = new FileOutputStream(reader.readLine());
        String st="";
        boolean flag=true;
        while(!(st=reader.readLine()).equals("exit"))
        {
            op.write((st+"\n").getBytes());

        }
        op.write((st+"\n").getBytes());
        op.close();
        reader.close();
    }
}
