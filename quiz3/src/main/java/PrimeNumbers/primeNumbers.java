package PrimeNumbers;

import java.util.ArrayList;
import java.util.List;

public class primeNumbers {

	public List<Integer> calcPrimes(int pnumero) {
		List <Integer> factores=  new ArrayList<>();
		if (pnumero>1) {
	        int numero = pnumero;
	        for (int i = 2; i <= numero; i++) {
	            if (numero % i == 0) {
	            	factores.add(i);
	                numero /= i;
	                i--;
	            }
	        }
		}
		return factores;
	}
}
