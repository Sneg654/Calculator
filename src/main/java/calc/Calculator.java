package calc;

/**
 * Created by Sergey_Stefoglo on 10/20/2016.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.abs;

public class Calculator {
    private static String INCORRECT_ONE_FROM_TWO = "One of the arguments are not correct";
    private static String INCORRECT_ARG = "incorrect argument";
    private static String COUNT_MORE_ZERO = "count of elements must be more or equeal 0";
    private static String ARG_MORE_ZERO = "Argument must be more or equeal 0";
    private static String DEV_ZERO = "can't division on zero";
    private ICalc calc;
    private static final ICalc CALC_INT = new CalculatorForInt();
    private static final ICalc CALC_FLOAT = new CalculatorForFloat();
    private static final ICalc CALC_OBJ = new CalculatorForAnotherObject();
    private Pattern patternDigital = Pattern.compile("-{0,1}\\d+(\\.\\d{1,})?");


    public Object addition(Object firstValue, Object secondValue) {
        checkTypeOfCalcForTwoParam(firstValue, secondValue);

        return calc.addition(firstValue, secondValue);
    }

    public Object subsctraction(Object firstValue, Object secondValue) {
        checkTypeOfCalcForTwoParam(firstValue, secondValue);
        return calc.subsctraction(firstValue, secondValue);
    }

    public Object multiplication(Object firstValue, Object secondValue) {

        checkTypeOfCalcForTwoParam(firstValue, secondValue);
        return calc.multiplication(firstValue, secondValue);
    }

    //
    public Object division(Object firstValue, Object secondValue) {
        checkTypeOfCalcForTwoParam(firstValue, secondValue);
        if (secondValue.toString().equals("0")|| secondValue.toString().equals("0.0")){
            throw new IllegalArgumentException(DEV_ZERO);
        }
        return calc.division(firstValue, secondValue);

    }

    //
    public Object root(Object value) {
        checkTypeOfCalcForOneParam(value);
        if (value.toString().indexOf("-") != -1) {
            throw new IllegalArgumentException(ARG_MORE_ZERO);
        }
        return calc.root(value);
    }

    public Object power(Object value) {
        checkTypeOfCalcForOneParam(value);
        return calc.power(value);
    }

    public List<Integer> fibonacciSiquence(int lastElement) {
        if (lastElement < 1) {
            throw new IllegalArgumentException(COUNT_MORE_ZERO);

        }
        List<Integer> siquence = new ArrayList<>();
        for (int i = 0; i < lastElement; i++) {
            siquence.add(fibonacci(i + 1));
        }


        return siquence;
    }

    private int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public boolean isPrime(long num) {
        num = abs(num);
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }


    private void checkTypeOfCalcForOneParam(Object value) {
        if (value == null) {
            throw new IllegalArgumentException(INCORRECT_ARG);
        }
        Matcher matcherDigital = patternDigital.matcher(value.toString());
        if (!matcherDigital.matches()) {
            throw new IllegalArgumentException(INCORRECT_ARG);
        } else if (value instanceof Integer) {
            calc = CALC_INT;
        } else if (value instanceof Float) {
            calc = CALC_FLOAT;
        } else if (value instanceof Double || value instanceof String) {
            calc = CALC_OBJ;
        } else {
            throw new IllegalArgumentException(INCORRECT_ARG);
        }


    }
//TODO we discussed about what 2 params must be the same type
    private void checkTypeOfCalcForTwoParam(Object firstValue, Object secondValue) {
        if (firstValue == null || secondValue == null) {
            throw new IllegalArgumentException(INCORRECT_ONE_FROM_TWO);
        }
        Matcher matcherFirstDigital = patternDigital.matcher(firstValue.toString());
        Matcher matcherSecondDigital = patternDigital.matcher(secondValue.toString());
        if (!matcherFirstDigital.matches() || !matcherSecondDigital.matches()) {
            throw new IllegalArgumentException(INCORRECT_ONE_FROM_TWO);
        } else if (firstValue instanceof Integer && secondValue instanceof Integer) {
            calc = CALC_INT;
        } else if (firstValue instanceof Float && secondValue instanceof Float) {
            calc = CALC_FLOAT;
        } else if (firstValue instanceof Double && secondValue instanceof Double) {
            calc = CALC_OBJ;
        } else if (firstValue instanceof String && secondValue instanceof String) {
            calc = CALC_OBJ;
        } else {
            throw new IllegalArgumentException(INCORRECT_ONE_FROM_TWO);
        }


    }


}
