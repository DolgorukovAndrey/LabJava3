package ru.Dolgorukov.main;

import static ru.Dolgorukov.main.Sum.sum;

public class TestSum {
    public void testSum(){
        double result1 = sum(new IntegerEl(2), new FractionEl(3, 5), new FractionEl(23, 10));
        System.out.println("2 + 3/5 + 2.3 = " + result1);
        double result2 = sum(new FractionEl(36, 10), new FractionEl(49, 12), new IntegerEl(3), new FractionEl(3, 2));
        System.out.println("3.6 + 49/12 + 3 + 3/2 = " + result2);
        double result3 = sum(new FractionEl(1, 3), new IntegerEl(1));
        System.out.println("1/3 + 1 = " + result3);
    }
}
