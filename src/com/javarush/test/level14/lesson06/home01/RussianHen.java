package com.javarush.test.level14.lesson06.home01;

/**
 * Created by lubuntu-v on 25.12.15.
 */
public class RussianHen extends Hen
{
    @Override
    String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.RUSSIA+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }
    @Override
    int getCountOfEggsPerMonth()
    {
        return 10;
    }
}
