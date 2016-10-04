package com.javarush.test.level17.lesson10.home09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
*/

public class Solution
{

    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args)
    {
        String fileNameAllLines = "";
        String fileNameForRemoveLines = "";

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        // Считываем имена файлов
        try
        {
            fileNameAllLines = consoleReader.readLine();
            fileNameForRemoveLines = consoleReader.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                consoleReader.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        // Построчно считываем данные из файла в переменную
        try
        {
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileNameAllLines)));
            String line;
            while ((line = fileReader.readLine()) != null)
            {
                allLines.add(line);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        // Построчно считываем данные из файла в переменную
        try
        {
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileNameForRemoveLines)));
            String line;
            while ((line = fileReader.readLine()) != null)
            {
                forRemoveLines.add(line);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
/*
        for (String str : allLines
             )
        {
            System.out.println(str);
        }

        for (String str : forRemoveLines
                )
        {
            System.out.println(str);
        }*/

        Solution s = new Solution();
        try
        {
            s.joinData();
        }
        catch (CorruptedDataException e)
        {
            e.printStackTrace();
            System.out.println("ololo exception here");
        }
    }

    public void joinData() throws CorruptedDataException
    {
        //boolean flag = true;
        // Если в allLines есть все строки из forRemoveLines, то true и удаляем совпадающие строки
        // , иначе трем всю allLines и кидаем исключение.
        for (String rmLns : forRemoveLines
                )
        {
            if (allLines.contains(rmLns))
            {
                //System.out.println(allLines.size());
            allLines.remove(rmLns);
                //System.out.println(allLines.size());
            }
            else {
                allLines.clear();
                throw new CorruptedDataException();
            }
        }

    }
}
