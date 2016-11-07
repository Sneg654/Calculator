package calc;

/**
 * Created by Sergey_Stefoglo on 10/26/2016.
 */
public class CalculatorForAnotherObject implements ICalc {
    private Double result;

    @Override
    public Object addition(Object firstValue, Object secondValue) {
        if (firstValue instanceof String) {
            result = Double.valueOf((String) firstValue) + Double.valueOf((String) secondValue);
        } else {
            result = (Double) firstValue + (Double) secondValue;
        }
        return result;
    }

    @Override
    public Object subsctraction(Object firstValue, Object secondValue) {
        if (firstValue instanceof String) {
            result = Double.valueOf((String) firstValue) - Double.valueOf((String) secondValue);
        } else {
            result = (Double) firstValue - (Double) secondValue;
        }
        return result;
    }

    @Override
    public Object multiplication(Object firstValue, Object secondValue) {
        if (firstValue instanceof String) {
            result = Double.valueOf((String) firstValue) * Double.valueOf((String) secondValue);
        } else {
            result = (Double) firstValue * (Double) secondValue;
        }
        return result;
    }

    @Override
    public Object division(Object firstValue, Object secondValue) throws IllegalArgumentException {

        if (firstValue instanceof String) {
            result = Double.valueOf((String) firstValue) / Double.valueOf((String) secondValue);
        } else {
            result = (Double) firstValue / (Double) secondValue;
        }
        return result;
    }

    @Override
    public Object root(Object value) throws IllegalArgumentException {
        if (value instanceof String) {
            result = Math.sqrt(Double.valueOf((String) value));
        } else {
            result = Math.sqrt((Double) value);
        }
        return result;
    }

    @Override
    public Object power(Object value) {
        if (value instanceof String) {
            result = Math.pow(Double.valueOf((String) value),2);
        } else {
            result = Math.pow((Double) value,2);
        }
        return result;
    }
}
