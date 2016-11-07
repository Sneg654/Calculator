package calc;

/**
 * Created by Sergey_Stefoglo on 10/23/2016.
 */
public class CalculatorForInt implements ICalc<Integer> {

    @Override
    public Integer addition(Integer firstValue, Integer secondValue) {
        return firstValue + secondValue;
    }

    @Override
    public Integer subsctraction(Integer firstValue, Integer secondValue) {
        return firstValue - secondValue;
    }

    @Override
    public Integer multiplication(Integer firstValue, Integer secondValue) {
        return firstValue * secondValue;
    }

    @Override
    public Integer division(Integer firstValue, Integer secondValue) throws IllegalArgumentException {
        if (secondValue.equals(0)) {
            throw new IllegalArgumentException("can't division on zero");
        }
        return firstValue / secondValue;
    }

    @Override
    public Integer root(Integer value) throws IllegalArgumentException {


        Double result = Math.sqrt(value);
        return result.intValue();
    }

    @Override
    public Integer power(Integer value) {
        return value * value;
    }
}
