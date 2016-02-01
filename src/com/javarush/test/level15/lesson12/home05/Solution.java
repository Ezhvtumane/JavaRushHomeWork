package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    public Solution(){}
    public Solution(String  pub){}
    public Solution(Double oub){}

    private Solution(Integer priv){}
    private Solution(Float priv){}
    private Solution(Object priv){}

    protected Solution(char prot){}
    protected Solution(char[] prot){}
    protected Solution(String[] prot){}

    Solution(int[] empt){}
    Solution(Float[] empt){}
    Solution(Object[] empt){}
}

