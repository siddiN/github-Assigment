package QUESTION1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddtwointegersTest {

	@Test
    public void testAdditionPositiveNumbers() {
        int num1 = 5;
        int num2 = 10;
        int expectedResult = 15;
        int actualResult = AddTwointegers.add(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAdditionNegativeNumbers() {
        int num1 = -8;
        int num2 = -3;
        int expectedResult = -11;
        int actualResult = AddTwointegers.add(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
}
