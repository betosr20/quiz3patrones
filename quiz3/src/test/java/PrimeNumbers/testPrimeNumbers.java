package PrimeNumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPrimeNumbers {

	@Test
	public void test() {
		primeNumbers primes = new primeNumbers();
		assertEquals("", primes.calcPrimes(1));
	}
	
	

}
