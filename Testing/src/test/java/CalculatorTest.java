import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();

        //actual == expected?

        assertThat(calc.add(2,2)).isEqualTo(4);
        assertThat(calc.add(2,2)).isEqualTo(4);
        assertThat(calc.add(2,2)).isEqualTo(4);
    }

    @Test
    public void testSubtract() {
        int actual = calc.subtract(5, 3);
        int expected = 2;
        assertThat(actual).isEqualTo(expected);
        actual = calc.subtract(10,4);
        expected = 6;
        assertThat(actual).isEqualTo(expected);
    }
    
    @Test
    public void testMultiply() {
        assertThat(calc.multiply(5,5)).isEqualTo(25);
        assertThat(calc.multiply(-5,5)).isEqualTo(-25);
        assertThat(calc.multiply(-5,-5)).isEqualTo(25);
    }
    
    @Test
    public void testDivide() {
        assertThat(calc.divide((Integer)50, (Integer)10)).isEqualTo(5);
        
    }


}

