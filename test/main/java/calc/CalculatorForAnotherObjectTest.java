package main.java.calc;

import calc.Calculator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * Created by Sergey_Stefoglo on 11/1/2016.
 */
public class CalculatorForAnotherObjectTest {
    private Calculator cal = new Calculator();

    @Test
    public void powerShouldSquaringDivisionalDoublesWithAccuracy() {
        //GIVEN
        double firstAtribute = 1110.95d;
        double expResult = 1234209.902d;
        double actResult;
        double accuracy = 0.001d;
        //WHEN
        actResult = (Double) cal.power(firstAtribute);
        //THEN
        assertThat(actResult, is(closeTo(expResult, accuracy)));
//        assertThat((Double) cal.power(1110.95d), is(closeTo(, 0.001d)));

    }

    @Test
    public void additionShouldSumTwoStringDigits() {
        //GIVEN
        String firstAttribute = "32";
        String secondAttribute = "10.33";
        Double expResult = 42.33d;
        double actResult;
        //WHEN
        actResult = (Double) cal.addition(firstAttribute, secondAttribute);
        //THEN
        assertThat(actResult, is(expResult));
    }

    @Test(expected = IllegalArgumentException.class)
    public void additionShouldThrowExceptionWhenIncorrectParams() {
        //GIVEN
        String firstAttribute = "32d";
        String secondAttribute = "10.33v";
        double actResult;
        //WHEN
        actResult = (Double) cal.addition(firstAttribute, secondAttribute);

    }

    @Test(expected = IllegalArgumentException.class)
    public void additionShouldThrowExceptionWhenOneIncorrectParam() {
        //GIVEN
        String firstAttribute = "dddddd";
        String secondAttribute = "10.33";
        double actResult;
        //WHEN
        actResult = (Double) cal.addition(firstAttribute, secondAttribute);
    }

    @Test(expected = IllegalArgumentException.class)
    public void additionShouldThrowExceptionWhenParamsIsNull() {
        //GIVEN
        String firstAttribute = null;
        String secondAttribute = null;
        double actResult;
        //WHEN
        actResult = (Double) cal.addition(firstAttribute, secondAttribute);

    }

    @Test(expected = IllegalArgumentException.class)
    public void additionShouldThrowExceptionWhenParamsIsIncorrectTypes() {
        //GIVEN
        Date firstAttribute = new Date();
        ArrayList secondAttribute = new ArrayList();
        double actResult;
        //WHEN
        actResult = (Double) cal.addition(firstAttribute, secondAttribute);

    }

    @Test
    public void divisionShouldDivisionTwoDoubles() {
        //GIVEN
        Double firstAttribute = 4d;
        Double secondAttribute = 10.33d;
        double accuracy = 0.001d;
        double actResult;
        double extResult = 0.387d;
        //WHEN
        actResult = (Double) cal.division(firstAttribute, secondAttribute);
        //THEN
        assertThat(actResult, is(closeTo(extResult, accuracy)));

    }

    @Test
    public void divisionShouldDivisionStringDigit() {
        //GIVEN
        String firstAttribute = "32";
        String secondAttribute = "10.33";
        double accuracy = 0.001d;
        double actResult;
        double extResult = 3.097d;
        //WHEN
        actResult = (Double) cal.division(firstAttribute, secondAttribute);
        //THEM
        assertThat(actResult, is(closeTo(extResult, accuracy)));

    }

    @Test(expected = IllegalArgumentException.class)
    public void divisionShouldThrowExceptionWhenParamsIsIncorrectString() {
        //GIVEN
        String firstAttribute = "dad";
        String secondAttribute = "10.2d33";
        double actResult;
        //WHEN
        actResult = (Double) cal.division(firstAttribute, secondAttribute);

    }

    @Test(expected = IllegalArgumentException.class)
    public void divisionShouldThrowExceptionWhenOneParamIsString() {
        //GIVEN
        String firstAttribute = "32";
        String secondAttribute = "ddsw3";
        double actResult;
        //WHEN
        actResult = (Double) cal.division(firstAttribute, secondAttribute);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divisionShouldThrowExceptionWhenParamsIsNull() {
        String firstAttribute = null;
        String secondAttribute = null;
        double actResult;
        //WHEN
        actResult = (Double) cal.division(firstAttribute, secondAttribute);

    }

    @Test(expected = IllegalArgumentException.class)
    public void divisionShouldThrowExceptionWhenParamsIsIncorrect() {
        //GIVEN
        Object firstAttribute = new Date();
        Object secondAttribute = new ArrayList();
        double actResult;
        //WHEN
        actResult = (Double) cal.division(firstAttribute, secondAttribute);

    }

    @Test(expected = IllegalArgumentException.class)
    public void divisionShouldThrowExceptionWhenDivisionByZero() {
        //GIVEN
        Double firstAttribute = 35d;
        Double secondAttribute = 0d;
        double actResult;
        //WHEN
        actResult = (Double) cal.division(firstAttribute, secondAttribute);

    }

    @Test()
    public void divisionShouldDivisionWhenOneAttributeIsLittleDigital() {
        //GIVEN
        Double firstAttribute = 35d;
        Double secondAttribute = 0.001d;
        double actResult;
        double extResult = 35000d;
        //WHEN
        actResult = (Double) cal.division(35d, 0.001d);
        //THEN
        assertThat(actResult, is(extResult));

    }

    @Test
    public void multiplicationShouldMultiplicationTwoDoubles() {  //GIVEN
        //GIVEN
        Double firstAttribute = 14d;
        Double secondAttribute = 10.33d;
        double actResult;
        double extResult = 144.62;
        //WHEN
        actResult = (Double) cal.multiplication(firstAttribute, secondAttribute);
        //THEN
        assertThat(actResult, is(extResult));

    }

    @Test
    public void multiplicationShouldMultiplicationOnePositiveAndOneNegativeDoubles() {
        //GIVEN
        Double firstAttribute = -14d;
        Double secondAttribute = 10.33d;
        double actResult;
        double extResult = -144.62;
        //WHEN
        actResult = (Double) cal.multiplication(firstAttribute, secondAttribute);
        //THEN
        assertThat(actResult, is(extResult));
    }

    @Test
    public void multiplicationShouldMultiplicationTwoStringDigits() {
        //GIVEN
        String firstAttribute = "32";
        String secondAttribute = "0.9";
        double actResult;
        double extResult = 28.8;
        //WHEN
        actResult = (Double) cal.multiplication(firstAttribute, secondAttribute);
        //THEN
        assertThat(actResult, is(extResult));

    }

    @Test(expected = IllegalArgumentException.class)
    public void multiplicationShouldThrowExceptionWhenTwoParamsIsIncorrectStrings() {
        //GIVEN
        String firstAttribute = "erre2";
        String secondAttribute = "erre";
        double actResult;

        //WHEN
        actResult = (Double) cal.multiplication(firstAttribute, secondAttribute);

    }

    @Test(expected = IllegalArgumentException.class)
    public void multiplicationShouldThrowExceptionWhenSecondParamIsIncorrectString() {
        //GIVEN
        String firstAttribute = "12";
        String secondAttribute = "erre";
        double actResult;

        //WHEN
        actResult = (Double) cal.multiplication(firstAttribute, secondAttribute);
    }

    @Test(expected = IllegalArgumentException.class)
    public void multiplicationShouldThrowExceptionWhenTwoParamsIsNull() {
        //GIVEN
        Double firstAttribute = null;
        Double secondAttribute = null;
        double actResult;

        //WHEN
        actResult = (Double) cal.multiplication(firstAttribute, secondAttribute);
    }

    @Test(expected = IllegalArgumentException.class)
    public void multiplicationShouldThrowExceptionWhenFierstParamIsDate() {
        //GIVEN
        Object firstAttribute = new Date();
        Double secondAttribute = null;
        double actResult;
        //WHEN
        actResult = (Double) cal.multiplication(firstAttribute, secondAttribute);
    }


    @Test
    public void powerShouldSquaredWhenAttributeIsStringDigit() {
        //GIVEN
        String attribute = "-111";
        double actResult;
        double extResult = 12321d;
        //WHEN
        actResult = (Double) cal.power(attribute);
        //THEN
        assertThat(actResult, is(extResult));

    }

    @Test(expected = IllegalArgumentException.class)
    public void powerShouldSquaredWhenAttributeIsIncorrectString() {
        //GIVEN
        String attribute = "ee";
        double actResult;
        //WHEN
        actResult = (Double) cal.power(attribute);
    }

    @Test(expected = IllegalArgumentException.class)
    public void powerShouldSquaredWhenAttributeIsDate() {
        //GIVEN
        Object attribute = new Date();
        double actResult;

        //WHEN
        actResult = (Double) cal.power(attribute);

    }

    @Test
    public void subsctractionShouldSubsctractionWhenTwoParamsIsDouble() {
        //GIVEN
        Double firstAttribute = 14d;
        Double secondAttribute = 10.33d;
        double actResult;
        double extResult = 3.67d;
        //WHEN
        actResult = (Double) cal.subsctraction(14d, 10.33d);
        //THEN
        assertThat(actResult, is(extResult));

    }

    @Test
    public void subsctractionShouldSubsctractionTwoObjectWhenFirstNegotiveDouble() {
        //GIVEN
        Double firstAttribute = -14d;
        Double secondAttribute = 10.33d;
        double actResult;
        double extResult = -24.33d;
        //WHEN
        actResult = (Double) cal.subsctraction(firstAttribute, secondAttribute);
        //THEN
        assertThat(actResult, is(extResult));


    }

    @Test
    public void subsctractionShouldSubsctractionWhenTwoParamsIsStringDigit() {
        //GIVEN
        String firstAttribute = "32";
        String secondAttribute = "10.33";
        double actResult;
        double extResult = 21.67d;
        //WHEN
        actResult = (Double) cal.subsctraction(firstAttribute, secondAttribute);
        //THEN
        assertThat(actResult, is(extResult));

    }

    @Test(expected = IllegalArgumentException.class)
    public void subsctractionShouldThrowExceptionWhenParamsHaveDifferentType() {
        //GIVEN
        Float firstAttribute = 32f;
        Double secondAttribute = 36d;
        double actResult;
        //WHEN
        actResult = (Double) cal.subsctraction(firstAttribute, secondAttribute);

    }

    @Test(expected = IllegalArgumentException.class)
    public void subsctractionShouldThrowExceptionWhenParamsIsIncorrectString() {
        //GIVEN
        String firstAttribute = "dsdd";
        String secondAttribute = "dsdsdw";
        double actResult;
        //WHEN
        actResult = (Double) cal.subsctraction(firstAttribute, secondAttribute);

    }

    @Test(expected = IllegalArgumentException.class)
    public void subsctractionShouldThrowExceptionWhenFirstParamIsIncorrectString() {
        //GIVEN
        String firstAttribute = "sw";
        String secondAttribute = "43";
        double actResult;
        //WHEN
        actResult = (Double) cal.subsctraction(firstAttribute, secondAttribute);


    }

    @Test(expected = IllegalArgumentException.class)
    public void subsctractionShouldThrowExceptionWhenParamsIsNull() {
        //GIVEN
        String firstAttribute = null;
        String secondAttribute = null;
        double actResult;
        //WHEN
        actResult = (Double) cal.subsctraction(firstAttribute, secondAttribute);
    }

    @Test(expected = IllegalArgumentException.class)
    public void subsctractionShouldThrowExceptionWhenFirstParamIsDate() {
        //GIVEN
        Object firstAttribute = new Date();
        Double secondAttribute = 33d;
        double actResult;
        //WHEN
        actResult = (Double) cal.subsctraction(firstAttribute, secondAttribute);

    }
}
