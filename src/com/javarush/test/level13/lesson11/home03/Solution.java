package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String st = reader.readLine();

        InputStream io = new FileInputStream(st);
        OutputStream op = new PrintStream((System.out));
        int data = 0;
        while(io.available()>0)
        {
            data = io.read();
            op.write(data);
        }

        io.close();
        op.close();






        io.close();
        //reader.close();
    }
}
