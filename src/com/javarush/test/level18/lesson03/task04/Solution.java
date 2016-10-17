package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        HashMap<Integer,Integer> bytes = new HashMap<>();

        Integer a=0;

        while(inputStream.available()>0){
            if(bytes.containsKey(a=inputStream.read())) {
                int value = bytes.get(a);
                bytes.put(a,++value);
                //System.out.println(a);
                //System.out.println(value);
            }
            else {
                bytes.put(a,new Integer(1));
                //System.out.println(a);
            }
        }

        a=1;

        for (Map.Entry entry : bytes.entrySet()
                )
        {
            if(a >= Integer.parseInt(entry.getValue().toString()))
                a =  Integer.parseInt(entry.getValue().toString());
        }
        //System.out.println(a);

        for (Map.Entry entry : bytes.entrySet()
                )
        {
            if(entry.getValue().equals(a))
                System.out.print(entry.getKey()+" ");
        }

        inputStream.close();
    }

}
