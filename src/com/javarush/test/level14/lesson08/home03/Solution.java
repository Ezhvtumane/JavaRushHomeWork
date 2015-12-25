package com.javarush.test.level14.lesson08.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* User, Looser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "looser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см Person.java], например, для строки "user" нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Looser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        ArrayList<String> list = new ArrayList<>();
       // HashMap<String, Person> map = new HashMap<>();

        key=reader.readLine();
        while(key.equals("user") || key.equals("looser") || key.equals("coder") || key.equals("proger"))
        {
            //System.out.println(key);
            list.add(key);
            key = reader.readLine();
        }
        for (int i = 0; i < list.size(); i++)
        {
            switch (list.get(i)){
                case "user":person = new Person.User();break;
                case "looser":person = new Person.Looser();break;
                case "coder":person = new Person.Coder();break;
                case "proger":person = new Person.Proger();break;
            }
                doWork(person); //вызываем doWork
        }

    }

    public static void doWork(Person person)
    {
        switch(person.getClass().getSimpleName()){
            case "User":
                Person.User.live();break;
            case "Looser":
                Person.Looser.doNothing();break;
            case "Coder":
                Person.Coder.coding();break;
            case "Proger":
                Person.Proger.enjoy();break;
        }
    }
}
