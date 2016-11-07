

package calc;


//**
//* Created by Sergey_Stefoglo on 10/23/2016.
// */
public class CalculatorForFloat implements ICalc<Float> {


    @Override
    public Float addition(Float firstValue, Float secondValue) {
        return firstValue + secondValue;
    }

    @Override
    public Float subsctraction(Float firstValue, Float secondValue) {
        return firstValue - secondValue;
    }

    @Override
    public Float multiplication(Float firstValue, Float secondValue) {
        return firstValue * secondValue;
    }

    @Override
    public Float division(Float firstValue, Float secondValue) throws IllegalArgumentException {
        return firstValue / secondValue;
    }

    @Override
    public Float root(Float value) throws IllegalArgumentException {

        Double result = Math.sqrt(value);
        return result.floatValue();
    }

    @Override
    public Float power(Float value) {
        return value * value;
    }

}
//}
