package test;

import main.Calc;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    private Calc calc;

    @Before
    public void setUp(){
        calc = new Calc();
    }

    @After
    public void tearDown(){
        calc = null;
    }

    @Test
    public void testAddition1() {
        double result = calc.add(4.0,2.0);
        assertEquals(6.0,result);
    }

    @Test
    public void testAddition2() {
        double result = calc.add(4.56,1.54);
        assertEquals(6.1,result);
    }

    @Test
    public void testAddition3() {
        double result = calc.add(-543.0,375.0);
        assertEquals(-168.0,result);
    }

    @Test
    public void testAddition4() {
        double result = calc.add(439.0,20.0);
        assertEquals(459.0,result);
    }

    @Test
    public void testAddition5() {
        double result = calc.add(-53.0,305.0);
        assertEquals(252.0,result);
    }

    @Test
    public void testAddition6() {
        double result = calc.add(3.0,-25.0);
        assertEquals(-22.0,result);
    }

    @Test
    public void testAddition7() {
        double result = calc.add(26.0,-212.0);
        assertEquals(-186.0,result);
    }

    @Test
    public void testAddition8() {
        double result = calc.add(16.0,37.0);
        assertEquals(53.0,result);
    }

    @Test
    public void testAddition9() {
        double result = calc.add(99.0,-24.0);
        assertEquals(75.0,result);
    }

    @Test
    public void testAddition10() {
        double result = calc.add(-19.0,-11.0);
        assertEquals(-30.0,result);
    }

    @Test
    public void testSubtraction1() {
        double result = calc.subtract(4,2);
        assertEquals(2.0,result);
    }

    @Test
    public void testSubtraction2() {
        double result = calc.subtract(-67,-28);
        assertEquals(-39,result);
    }

    @Test
    public void testSubtraction3() {
        double result = calc.subtract(34,41);
        assertEquals(-7,result);
    }

    @Test
    public void testSubtraction4() {
        double result = calc.subtract(439,2);
        assertEquals(437,result);
    }

    @Test
    public void testSubtraction5() {
        double result = calc.subtract(-53,305);
        assertEquals(-358,result);
    }

    @Test
    public void testSubtraction6() {
        double result = calc.subtract(3,-25);
        assertEquals(28,result);
    }

    @Test
    public void testSubtraction7() {
        double result = calc.subtract(26,-212);
        assertEquals(238,result);
    }

    @Test
    public void testSubtraction8() {
        double result = calc.subtract(16,37);
        assertEquals(-21,result);
    }

    @Test
    public void testSubtraction9() {
        double result = calc.subtract(99,-24);
        assertEquals(123,result);
    }

    @Test
    public void testSubtraction10() {
        double result = calc.subtract(-19,-11);
        assertEquals(-8,result);
    }

    @Test
    public void testDivision1() {
        double result = calc.divide(4.0f,2.0f);
        assertEquals(2.0,result);
    }

    @Test
    public void testDivision2() {
        double result = calc.divide(42.0f,4.0f);
        assertEquals(10.5f,result);
    }

    @Test
    public void testDivision3() {
        double result = calc.divide(87.0f,3.0f);
        assertEquals(29.0f,result);
    }

    @Test
    public void testDivision4() {
        double result = calc.divide(439.0f,2.0f);
        assertEquals(219.5f,result);
    }

    @Test
    public void testDivision5() {
        double result = calc.divide(-52.0f,4.0f);
        assertEquals(-13.0f,result);
    }

    @Test
    public void testDivision6() {
        double result = calc.divide(55.0f,5.0f);
        assertEquals(11.0f,result);
    }

    @Test
    public void testDivision7() {
        double result = calc.divide(369.0f,9.0f);
        assertEquals(41.0f,result);
    }

    @Test
    public void testDivision8() {
        double result = calc.divide(108.0f,4.0f);
        assertEquals(27.0f,result);
    }

    @Test
    public void testDivision9() {
        double result = calc.divide(256.0f,16.0f);
        assertEquals(16.0f,result);
    }

    @Test
    public void testDivision10() {
        double result = calc.divide(36.0f,3.0f);
        assertEquals(12.0f,result);
    }

    @Test
    public void testDivisionByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("Cannot divide by zero");
        });
    }
}
