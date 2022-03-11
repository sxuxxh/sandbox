package week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("The Calculator Test")
class CalculatorTest {

    //Field / Attribute
    Calculator calculator;

    @BeforeEach
    void beforeEach() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Addition Test")
    void add() {
        assertEquals(3, calculator.add(1, 2));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5})
    @DisplayName("Checking for Odd Test")
    void isOdd_ShouldReturnTrueForOddNumbers(int number) {
        assertTrue(calculator.isOdd(number));
    }

    @RepeatedTest(10)
    @DisplayName("Repeating Test")
    void repTest() {
        System.out.println("Repeat");
    }
}