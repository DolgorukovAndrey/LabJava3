package ru.Dolgorukov.main;

interface ConvertDouble {
    double toDouble();
}

class IntegerEl implements ConvertDouble {
    private int value;

    public IntegerEl(int value) {
        this.value = value;
    }

    @Override
    public double toDouble() {
        return (double) value;
    }
}

class FractionEl implements ConvertDouble {
    private int numerator;
    private int denominator;

    public FractionEl (int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public double toDouble() {
        return (double) numerator / denominator;
    }
}


public class Sum {
    public static double sum(ConvertDouble... numbers) {
        double result = 0.0;
        for (ConvertDouble number : numbers) {
            result += number.toDouble();
        }
        return result;
    }
}

