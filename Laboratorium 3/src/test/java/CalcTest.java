import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
    public void testSubtraction1() {
        double result = calc.subtract(4.0,2.0);
        assertEquals(2.0,result);
    }

    @Test
    public void testSubtraction2() {
        double result = calc.subtract(-67.8,-28.4);
        assertEquals(-39.4,result);
    }

    @Test
    public void testSubtraction3() {
        double result = calc.subtract(34.8,41.3);
        assertEquals(-6.5,result);
    }

    @Test
    public void testMultiplication1() {
        double result = calc.multiply(4.0,2.0);
        assertEquals(8.0,result);
    }

    @Test
    public void testMultiplication2() {
        double result = calc.multiply(5.5,-6.2);
        assertEquals(-34.1,result);
    }

    @Test
    public void testMultiplication3() {
        double result = calc.multiply(4.54,2.879);
        assertEquals(13.07066,result);
    }

    @Test
    public void testDivision1() {
        double result = calc.divide(4.0,2.0);
        assertEquals(2.0,result);
    }

    @Test
    public void testDivision2() {
        double result = calc.divide(42.0,4.0);
        assertEquals(10.5,result);
    }

    @Test
    public void testDivision3() {
        double result = calc.divide(87.0,3.0);
        assertEquals(29.0,result);
    }

    @Test
    public void testIsPrimeTrue1() {
        boolean result = calc.isPrime(5);
        assertTrue(result);
    }

    @Test
    public void testIsPrimeTrue2() {
        boolean result = calc.isPrime(367);
        assertTrue(result);
    }

    @Test
    public void testIsPrimeTrue3() {
        boolean result = calc.isPrime(149);
        assertTrue(result);
    }

    @Test
    public void testIsPrimeTrue4() {
        boolean result = calc.isPrime(11);
        assertTrue(result);
    }

    @Test
    public void testIsPrimeTrue5() {
        boolean result = calc.isPrime(23);
        assertTrue(result);
    }

    @Test
    public void testIsPrimeFalse1() {
        boolean result = calc.isPrime(143);
        assertFalse(result);
    }

    @Test
    public void testIsPrimeFalse2() {
        boolean result = calc.isPrime(876);
        assertFalse(result);
    }

    @Test
    public void testIsPrimeFalse3() {
        boolean result = calc.isPrime(22);
        assertFalse(result);
    }

    @Test
    public void testIsPrimeFalse4() {
        boolean result = calc.isPrime(84);
        assertFalse(result);
    }

    @Test
    public void testIsPrimeFalse5() {
        boolean result = calc.isPrime(12);
        assertFalse(result);
    }
}
