package com.javarush.test.level14.lesson06.home01;

/**
 * Created by lubuntu-v on 25.12.15.
 */
public class MoldovanHen extends Hen
{
    @Override
    String getDescription()
    {
        return super.getDescription()+" Моя страна - "+Country.MOLDOVA+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }
    @Override
    int getCountOfEggsPerMonth()
    {
        return 8;
    }
}
