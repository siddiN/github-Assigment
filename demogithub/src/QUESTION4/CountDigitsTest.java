package QUESTION4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountDigitsTest {

	  @Test
	    public void testCountDigitsWithPositiveNumber() {
	        int number = 12345;
	        int expectedCount = 5;
	        assertEquals(expectedCount, CountDigits.countDigits(number));
	    }

	    @Test
	    public void testCountDigitsWithNegativeNumber() {
	        int number = -9876;
	        int expectedCount = 4;
	        assertEquals(expectedCount, CountDigits.countDigits(number));
	    }
	}


