package com.javarush.test.level11.t05;

import com.javarush.test.level11.t04.Manager;

/**
 * Created by georgy on 11.12.15.
 */

/*
*
* Написать девять классов: Worker(сотрудник), Clerk(клерк), IT(ИТ-специалист),
* Programmer(программист), ProjectManager(менеджер проекта), CTO(технический директор),
* HR(рекрутер), OfficeManager(офис-менеджер), Cleaner(уборщик).
Унаследовать программиста, менеджера проекта и технического директора от ИТ-специалиста.
Унаследовать рекрутера, уборщика и офис-менеджера от клерка.
Унаследовать клерка и ИТ-специалиста от сотрудника.
 */
public class Main
{
    public static void main(String[] args)
    {
        Programmer pr = new Programmer();
        pr.className();

        Clerk cl = new Clerk();
        cl.className();
        cl.age = 12;
        cl.name = "John";

        Worker pm = new ProjectManager();
        pm.className();

    }
}
