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
		assertEquals(testList, primes.generate(1));
	}
	
	@Test
	public void test2() {
		testList.add(2);
		assertEquals(testList, primes.generate(2));
	}

	@Test
	public void test3() {
		testList.add(3);
		assertEquals(testList, primes.generate(3));
	}
	
	@Test
	public void test4() {
		testList.add(2);
		testList.add(2);
		assertEquals(testList, primes.generate(4));
	}

	@Test
	public void test5() {
		testList.add(5);
		assertEquals(testList, primes.generate(5));
	}

	@Test
public void test6() {
	testList.add(2);
	testList.add(3);
	assertEquals(testList, primes.generate(6));
	}

	@Test
public void test7() {
	testList.add(7);
	assertEquals(testList, primes.generate(7));
	}

	@Test
public void test8() {
	testList.add(2);
	testList.add(2);
	testList.add(2);
	assertEquals(testList, primes.generate(8));
	}

	@Test
public void test9() {
	testList.add(3);
	testList.add(3);
	assertEquals(testList, primes.generate(9));
	}

	@Test
public void test10() {
	testList.add(2);
	testList.add(2);
	testList.add(3);
	testList.add(3);
	assertEquals(testList, primes.generate(36));
	}

	@Test
public void test11() {
	testList.add(2);
	testList.add(3);
	testList.add(7);
	assertEquals(testList, primes.generate(42));
	}

	@Test
public void test12() {
	testList.add(2);
	testList.add(2);
	testList.add(3);
	testList.add(5);
	testList.add(7);
	testList.add(11);
	assertEquals(testList, primes.generate(4620));
	}
}
