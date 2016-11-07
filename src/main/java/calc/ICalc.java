package calc;

/**
 * Created by Sergey_Stefoglo on 10/23/2016.
 */
public interface ICalc<T> {
    T addition(T firstValue, T secondValue);

    T subsctraction(T firstValue, T secondValue);

    T multiplication(T firstValue, T secondValue);

    T division(T firstValue, T secondValue) throws IllegalArgumentException;

    T root(T value) throws IllegalArgumentException;

    T power(T value);


}
