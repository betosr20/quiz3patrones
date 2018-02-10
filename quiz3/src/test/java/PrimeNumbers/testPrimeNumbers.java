package PrimeNumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPrimeNumbers {

	@Test
	public void test() {
		primeNumbers primes = new primeNumbers();
		assertEquals("", primes.calcPrimes(1));
	}
	
	@Test
	public void test2() {
		primeNumbers primes = new primeNumbers();
		assertEquals("2", primes.calcPrimes(2));
	}
	
	

}
