package PrimeNumbers;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class testPrimeNumbers {
	primeNumbers primes = new primeNumbers();
	List<Integer> testList = new ArrayList<Integer>();
	
	@Before
	public void limpiarLista() {
		testList.clear();
	}
	
	@Test
	public void test() {
		assertEquals(testList, primes.calcPrimes(1));
	}
	
	@Test
	public void test2() {
		testList.add(2);
		assertEquals(testList, primes.calcPrimes(2));
	}

	@Test
	public void test3() {
		testList.add(3);
		assertEquals(testList, primes.calcPrimes(3));
	}
	
	@Test
	public void test4() {
		testList.add(2);
		testList.add(2);
		assertEquals(testList, primes.calcPrimes(4));
	}

	@Test
	public void test5() {
		testList.add(5);
		assertEquals(testList, primes.calcPrimes(5));
	}

	@Test
public void test6() {
	testList.add(2);
	testList.add(3);
	assertEquals(testList, primes.calcPrimes(6));
	}
}
