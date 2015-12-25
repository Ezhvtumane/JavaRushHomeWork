package com.javarush.test.level14.lesson06.home01;

/**
 * Created by lubuntu-v on 25.12.15.
 */
public class BelarusianHen extends Hen //implements Country
{
    //private String country = Country.BELARUS;
    @Override
    String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.BELARUS+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }

    @Override
    int getCountOfEggsPerMonth()
    {
        return 7;
    }
}
