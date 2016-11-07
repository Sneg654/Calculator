package main.java.calc;

import calc.Calculator;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Sergey_Stefoglo on 11/1/2016.
 */
public class CalculatorForFloatTest {
    private Calculator cal = new Calculator();


    @Test
    public void additionShouldSumTwoFloats() {

        //GIVEN
        float firstAttribute = 5;
        float secondAttribute = 10;
        float expResult = 15;
        float actResult;
        //WHEN
        actResult = (Float) cal.addition(firstAttribute, secondAttribute);
        //THEN
        assertThat(actResult, is(expResult));


    }

    @Test
    public void additionShouldSumOneNegotiveAndOnePositiveFloats() {
        //GIVEN
        float firstAttribute = -5.5f;
        float secondAttribute = 10f;
        float expResult = 4.5f;
        float actResult;
        //WHEN
        actResult = (Float) cal.addition(firstAttribute, secondAttribute);
        //THEN
        assertThat(actResult, is(expResult));


    }

    @Test
    public void divisionShouldDivisionTwoPositiveFloat() {
        //GIVEN
        float firstAttribute = 5f;
        float secondAttribute = 10f;
        float expResult = 0.5f;
        float actResult;
        //WHEN
        actResult = (Float) cal.division(firstAttribute, secondAttribute);
        //THEN
        assertThat(actResult, is(expResult));


    }

    @Test
    public void divisionShouldSumOneNegotiveAndOnePositiveFloats() {
        //GIVEN
        float firstAttribute = -5.5f;
        float secondAttribute = 10f;
        float expResult = -0.55f;
        float actResult;
        //WHEN
        actResult = (Float) cal.division(firstAttribute, secondAttribute);
        //THEN
        assertThat(actResult, is(expResult));

    }


    @Test
    public void multiplicationShouldMultiplicationTwoPositiveFloats() {

        //GIVEN
        float firstAttribute = 5f;
        float secondAttribute = 5f;
        float expResult = 25f;
        float actResult;
        //WHEN
        actResult = (Float) cal.multiplication(firstAttribute, secondAttribute);
        //THEN
        assertThat(actResult, is(expResult));

    }

    @Test
    public void multiplicationShouldMultiplicationOneDivisionalAndOneWholePositiveFloats() {

        //GIVEN
        float firstAttribute = 15.5f;
        float secondAttribute = 10f;
        float expResult = 155f;
        float actResult;
        //WHEN
        actResult = (Float) cal.multiplication(firstAttribute, secondAttribute);
        //THEN
        assertThat(actResult, is(expResult));

    }


    @Test
    public void powerShouldSquaringDivisionalFloat() {
        //GIVEN
        float firstAttribute = 14.1f;
        float expResult = 198.81001f;
        float actResult;
        //WHEN
        actResult = (Float) cal.power(firstAttribute);
        //THEN
        assertThat(actResult, is(expResult));


    }

    @Test
    public void rootShouldGetRootFromPositiveFloat() {
       //GIVEN
        float attribute = 14f;
        float expResult = 3.7416575f;
        float actResult;
        //WHEN
        actResult = (Float) cal.root(attribute);
        //THEN
        assertThat(actResult, is(expResult));

    }

    @Test(expected = IllegalArgumentException.class)
    public void rootShouldThrowExceptionWhenGetRootFromNegotiveFloat() {
        //GIVEN
        float attribute = 14f;
        float actResult;
        //WHEN
        actResult = (Float)cal.root(-14f);

    }

    @Test
    public void subsctractionShouldSubsctractionTwoPositiveFloat() {
        //GIVEN
        float firstAttribute = 15f;
        float secondAttribute = 5f;
        float actResult;
        float expResult = 10f;
        //WHEN
        actResult = (Float)cal.subsctraction(firstAttribute, secondAttribute);
        //THEN
        assertThat(actResult, is(expResult));

    }

    @Test
    public void subsctractionShouldSubsctractionOnePositiveAndOneNegativeFloat() {
        //GIVEN
        float firstAttribute = 15.5f;
        float secondAttribute = -10f;
        float actResult;
        float expResult = 25.5f;
        //WHEN
        actResult = (Float)cal.subsctraction(firstAttribute, secondAttribute);
        //THEN
        assertThat(actResult, is(expResult));

    }

}
