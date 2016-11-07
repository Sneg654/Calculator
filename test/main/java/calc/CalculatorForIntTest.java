package main.java.calc;

import calc.Calculator;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Sergey_Stefoglo on 11/1/2016.
 */
public class CalculatorForIntTest {
    Calculator cal = new Calculator();

    @Test
    public void additionShouldSumTwoPositiveInt() {

        //GIVEN
        int firstAtribute = 5;
        int secondAtribute = 10;
        int expResult = 15;
        int actResult;
        //WHEN
        actResult = (Integer) cal.addition(firstAtribute, secondAtribute);
        //THEN
        assertThat(actResult, is(expResult));

    }

    @Test
    public void additionShouldSumTwoNegative5isResultMustBeNegative() {
        //GIVEN
        int firstAtribute = -5;
        int secondAtribute = -5;
        int expResult = -10;
        int actResult;
        //WHEN
        actResult = (Integer) cal.addition(firstAtribute, secondAtribute);
        //THEN
        assertThat(actResult, is(expResult));

    }

    @Test
    public void divisionShouldShow2AfterDivision20and10() {
        //GIVEN
        int firstAtribute = 20;
        int secondAtribute = 10;
        int expResult = 2;
        int actResult;
        //WHEN
        actResult = (Integer) cal.division(firstAtribute, secondAtribute);
        // THEN
        assertThat(actResult, is(expResult));

    }

    @Test
    public void divisionShouldShowNegativeAroundToIntegerNumberAfterDivision16andNegotive5() {
        //GIVEN
        int firstAtribute = 16;
        int secondAtribute = -5;
        int expResult = -3;
        int actResult;
        //WHEN
        actResult = (Integer) cal.division(firstAtribute, secondAtribute);
       //THEN
        assertThat(actResult, is(expResult));
    }

    @Test

    public void multiplicationShouldShow50afterMultiplication5and10() {
        //GIVEN
        int firstAtribute = 5;
        int secondAtribute = 10;
        int expResult = 50;
        int actResult;
        //WHEN
        actResult = (Integer) cal.multiplication(firstAtribute, secondAtribute);
        //THEN
        assertThat(actResult, is(expResult));

    }

    @Test
    public void  multiplicationShouldShowPositeveValueAfterMultiplicationTwoNegative() {
        //GIVEN
        int firstAtribute = -5;
        int secondAtribute = -5;
        int expResult = 25;
        int actResult;
        //WHEN
        actResult = (Integer) cal.multiplication(firstAtribute, secondAtribute);
        //THEN
        assertThat(actResult, is(expResult));
    }

    @Test
    public void rootShouldGetRootForm9() {
        //GIVEN
        int atribute = 9;
        int expResult = 3;
        int actResult;
        //WHEN
        actResult = (Integer) cal.root(atribute);
      //THEN
        assertThat(actResult, is(expResult));

    }

    @Test
    public void rootShouldGetAroundRootForm6() {
        //GIVEN
        int atribute = 6;
        int expResult = 2;
        int actResult;
        //WHEN
        actResult = (Integer) cal.root(atribute);
        //THEN
        assertThat(actResult, is(expResult));
    }
    @Test
    public void powerShouldShow81afterBuildDegree9() {
        //GIVEN
        int atribute = 9;
        int expResult = 81;
        int actResult;
        //WHEN
        actResult = (Integer) cal.power(atribute);
        //THEN
        assertThat(actResult, is(expResult));


    }

    @Test
    public void  powerShouldShow36afterBuildDegreeNegotive6() {
        //GIVEN
        int atribute =-6;
        int expResult = 36;
        int actResult;
        //WHEN
        actResult = (Integer) cal.power(atribute);
        //THEN
        assertThat(actResult, is(expResult));


    }

    @Test
    public void subsctractionShouldShowNegotiveDigitalAfterSubsctraction() {
        //GIVEN
        int firstAtribute = 5;
        int secondAtribute = 10;
        int expResult = -5;
        int actResult;
        //WHEN
        actResult = (Integer) cal.subsctraction(firstAtribute, secondAtribute);
        //THEN
        assertThat(actResult, is(expResult));

    }

    @Test
    public void  subsctractionShouldAdditionArgAfterTwoMinus() {
        //GIVEN
        int firstAtribute = -5;
        int secondAtribute = -5;
        int expResult = 0;
        int actResult;
        //WHEN
        actResult = (Integer) cal.subsctraction(firstAtribute, secondAtribute);
        //THEN
        assertThat(actResult, is(expResult));

    }
}
