import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {
    Calculator c = null;

    // Mock
    AdditionService additionService = mock(AdditionService.class);
    SubtractionService subtractionService = mock(SubtractionService.class);

    // Stub
    MultiplicationService multiplicationService = new MultiplicationService() {
        @Override
        public int multiply(int x, int y) {
            return 12;
        }
    };

    // Testing using a mock
    @Test
    public void testPerformAddition1() {
        // given
        c = new Calculator(additionService);
        int x = 3, y = 4;
        // when
        when(additionService.add(x, y)).thenReturn(7);
        // then
        assertEquals(10, c.performAddition(x, y));
    }

    @Test
    public void testPerformAddition2() {
        // given
        c = new Calculator(additionService);
        int x = 5, y = 9;
        // when
        when(additionService.add(x, y)).thenReturn(14);
        // then
        assertEquals(19, c.performAddition(x, y));
    }

    @Test
    public void testPerformAddition3() {
        // given
        c = new Calculator(additionService);
        int x = 6, y = 2;
        // when
        when(additionService.add(x, y)).thenReturn(8);
        // then
        assertEquals(14, c.performAddition(x, y));
    }

    @Test
    public void testPerformSubtraction1() {
        // given
        c = new Calculator(subtractionService);
        int x = 8, y = 3;
        // when
        when(subtractionService.subtract(x, y)).thenReturn(5);
        // then
        assertEquals(-3, c.performSubtraction(x, y));
    }

    @Test
    public void testPerformSubtraction2() {
        // given
        c = new Calculator(subtractionService);
        int x = 20, y = -14;
        // when
        when(subtractionService.subtract(x, y)).thenReturn(34);
        // then
        assertEquals(14, c.performSubtraction(x, y));
    }

    @Test
    public void testPerformSubtraction3() {
        // given
        c = new Calculator(subtractionService);
        int x = -24, y = 36;
        // when
        when(subtractionService.subtract(x, y)).thenReturn(-60);
        // then
        assertEquals(-36, c.performSubtraction(x, y));
    }

    // Testing using a stub
    @Test
    public void testCalculate() {
        c = new Calculator(multiplicationService);
        assertEquals(36, c.calculate(3, 4));
    }

}
