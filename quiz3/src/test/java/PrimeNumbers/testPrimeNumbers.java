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

	@Test
	public void test3() {
		List<Integer> testList = new ArrayList<Integer>();
		testList.add(3);
		assertEquals(testList, primes.calcPrimes(3));
	}
	
	@Test
	public void test4() {
		List<Integer> testList = new ArrayList<Integer>();
		testList.add(2);
		testList.add(2);
		assertEquals(testList, primes.calcPrimes(4));
	}

	@Test
	public void test5() {
		List<Integer> testList2 = new ArrayList<Integer>();
		testList2.add(5);
		assertEquals(testList2, primes.calcPrimes(5));
	}

}
