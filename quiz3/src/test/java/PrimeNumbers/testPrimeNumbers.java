package PrimeNumbers;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class testPrimeNumbers {
	primeNumbers primes = new primeNumbers();
	@Test
	public void test() {
		List<Integer> testList = new ArrayList<Integer>();
		assertEquals(testList, primes.calcPrimes(1));
	}
	
	@Test
	public void test2() {
		List<Integer> testList = new ArrayList<Integer>();
		testList.add(2);
		assertEquals(testList, primes.calcPrimes(2));
	}
}
