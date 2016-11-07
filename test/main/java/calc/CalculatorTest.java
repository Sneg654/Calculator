package main.java.calc;

import calc.Calculator;
import org.junit.Test;

import java.util.List;

import static java.util.Optional.empty;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Sergey_Stefoglo on 11/1/2016.
 */
public class CalculatorTest {
Calculator cal=new Calculator();
    @Test
    public void  isPrimeShouldCheckLongPrimeDigital() {
        //GIVEN
        long arg=99990001;
        boolean isResult;

        //WHEN
        isResult=cal.isPrime(arg);

        //THEN
       assertTrue(isResult);

    }

    @Test
    public void isPrimeShouldCheck500isNotPrimeDigital() {
        //GIVEN
        long arg=500;
        boolean isResult;

        //WHEN
        isResult=cal.isPrime(arg);
        //THEN
        assertFalse(isResult);
    }

    @Test
    public void isPrimeShouldCheckNegativeDigitalIsPrime() {

        //GIVEN
        long arg=-99990001;
        boolean isResult;

        //WHEN
        isResult=cal.isPrime(arg);
        //THEN
        assertTrue(isResult);
    }

    @Test
    public void isPrimeShouldCheckNotPrimeNegativeDigital() {

        //GIVEN
        long arg=-500;
        boolean isResult;
        //WHEN
        isResult=cal.isPrime(arg);
        //THEN
        assertFalse(isResult);
    }

    @Test(timeout = 1000)
    public void isPrimeShouldRunBeforeTimeout() {
        //GIVEN
        long arg=-1000000000000000111l;
        boolean isResult;
        //WHEN
        isResult=cal.isPrime(arg);
        //THEN
        assertFalse(isResult);
    }

    @Test
    public void fibonacciSequenceShouldCheckFirstTenElements() {
        //GIVEN
        int countArguments=10;
         List<Integer> sequence;
        //WHEN
        sequence=cal.fibonacciSiquence(10);
        //THEN
        assertThat(sequence, contains(1, 1, 2, 3, 5, 8, 13, 21, 34, 55));

    }

    @Test
    public void fibonacciSequenceShouldHasTenElements() {
        //GIVEN
        int countArguments=10;
        List<Integer> sequence;
        int waitingCount=10;
        //WHEN
        sequence=cal.fibonacciSiquence(countArguments);
        //THEN
        assertThat(sequence, hasSize(waitingCount));

    }

    @Test
    public void fibonacciSequenceShouldConstrainFiveAndEight() {
//GIVEN
        int countArguments=10;
        List<Integer> sequence;
        int firstCheckValue=5;
        int secondCheckValue=8;
        //WHEN
        sequence=cal.fibonacciSiquence(countArguments);
        //THEN
        assertThat(sequence, hasItems(firstCheckValue, secondCheckValue));

    }

    @Test
    public void  fibonacciSequenceShouldBeNotEmpty() {
        int countArguments=10;
        List<Integer> sequence;
        //WHEN
        sequence=cal.fibonacciSiquence(countArguments);
        //THEN
        assertThat(sequence, is(not(empty())));

    }

    @Test(expected = IllegalArgumentException.class)
    public void fibonacciSequenceShouldThrowExceptionWhenArgumentEqualZero() {
        //GIVEN
        int countArguments=0;
        List<Integer> sequence;
       // WHEN
        sequence=cal.fibonacciSiquence(countArguments);


    }

    @Test(expected = IllegalArgumentException.class)
    public void fibonacciSequence_ShouldThrowExceptionWhenArgumentLessZero(){
        //GIVEN
        int countArguments=-5;
        List<Integer> sequence;
        // WHEN
        sequence=cal.fibonacciSiquence(countArguments);

    }


}