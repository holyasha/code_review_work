import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(2, calculator.add(1,1));
    }

    @Test
    void dif() {
        assertEquals(2, calculator.dif(4,2));
    }

    @Test
    void div() {
        assertEquals(3, calculator.div(9,3));
    }

    @Test
    void times() {
        assertEquals(4, calculator.times(2,2));
    }

    @Test
    void solver() {
        assertEquals(17,calculator.solver());
    }
}