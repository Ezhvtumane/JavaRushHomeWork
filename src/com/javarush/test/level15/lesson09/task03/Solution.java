package com.javarush.test.level15.lesson09.task03;

/* Статики 3
1. Создать 7 public полей класса. Убедитесь, что они инициализируются дефолтными значениями.
intVar с типом int
doubleVar с типом double
DoubleVar с типом Double
booleanVar с типом boolean
ObjectVar с типом Object
ExceptionVar с типом Exception
StringVar с типом String
2. В методе main вывести их значения в заданном порядке.
*/

public class Solution {


        public static int intvar;
        public static double doublevar;
        public static Double Doublevar;
        public static boolean booleanvar;
        public static Object Objectvar;
        public static Exception Exceptionvar;
        public static String Stringvar;

    public static void main(String[] args) {
        System.out.println(intvar);
        System.out.println(doublevar);
        System.out.println(Doublevar);
        System.out.println(booleanvar);
        System.out.println(Objectvar);
        System.out.println(Exceptionvar);
        System.out.println(Stringvar);
    }
}
