package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.Date;
import java.util.zip.DataFormatException;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private int iq;
        private int height;
        private int weight;
        private boolean sex;
        private Date birthday;
        private String FIO;

        Human(){}

        Human(int height,int weight)
        {
            this.height=height;
            this.weight=weight;
        }

        Human(int height,int weight, boolean sex)
        {
            this.height=height;
            this.weight=weight;
            this.sex=sex;
        }

        Human(int height,int weight, boolean sex, int iq)
        {
            this.height=height;
            this.weight=weight;
            this.sex=sex;
            this.iq=iq;
        }

        Human(int height,int weight, boolean sex, int iq, Date bd)
        {
            this.height=height;
            this.weight=weight;
            this.sex=sex;
            this.iq=iq;
            this.birthday=bd;
        }

        Human(int height,int weight, boolean sex, int iq, Date bd, String name)
        {
            this.height=height;
            this.weight=weight;
            this.sex=sex;
            this.iq=iq;
            this.birthday=bd;
            this.FIO=name;
        }

        Human(boolean sex, int iq, Date bd, String name)
        {
            this.sex=sex;
            this.iq=iq;
            this.birthday=bd;
            this.FIO=name;
        }

        Human(int iq, Date bd, String name)
        {
            this.iq=iq;
            this.birthday=bd;
            this.FIO=name;
        }

        Human(boolean sex, Date bd, String name)
        {
            this.sex=sex;
            this.birthday=bd;
            this.FIO=name;
        }

        Human(String name)
        {
            this.FIO=name;
        }
    }
}
