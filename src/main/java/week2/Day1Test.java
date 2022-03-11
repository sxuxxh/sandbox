package week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day1Test {

    Day1 day1;

    @BeforeEach
    void beforeEach() {
        day1 = new Day1();
    }

    @Test
    void firstTest() {
        assertEquals("Hello World Of Test!",day1.firstTest());
    }

}