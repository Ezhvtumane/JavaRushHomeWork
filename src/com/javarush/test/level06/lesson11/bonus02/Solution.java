package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String gfName = reader.readLine();
        Cat catGrf = new Cat(gfName);

        String gmName = reader.readLine();
        Cat catGrm = new Cat(gmName);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catGrm);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,catGrf);

        String douterName = reader.readLine();
        Cat catDKid = new Cat(douterName, catMother, catFather);

        String sonName = reader.readLine();
        Cat catSKid = new Cat(sonName, catMother, catFather);

        System.out.println(catGrf);
        System.out.println(catGrm);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSKid);
        System.out.println(catDKid);
    }

    public static class Cat
    {
        private String name;
        private Cat mother;
        private Cat father;
        private Cat parent;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat parent)
        {
            this.name = name;
            this.parent = parent;
        }

        Cat(String name, Cat mother, Cat father)
        {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString()
        {
            if(parent == null)
            {
                if (mother == null && father == null)
                    return "Cat name is " + name + ", no mother, no father ";
                else if (mother == null && father != null)
                    return "Cat name is " + name + ", no mother, father is" + father.name;
                else if (mother != null && father == null)
                    return "Cat name is " + name + ", mother is " + mother.name + ", no father";
                else return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            }
return " ";

        }
    }

}
