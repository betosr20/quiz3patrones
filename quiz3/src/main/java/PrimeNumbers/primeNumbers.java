package PrimeNumbers;

import java.util.ArrayList;
import java.util.List;

public class primeNumbers {

	public List<Integer> generate(int pnumero) {
		List <Integer> factores=  new ArrayList<>();
	        int numero = pnumero;
	        for (int i = 2; i <= numero; i++) {
	            if (numero % i == 0) {
	            	factores.add(i);
	                numero /= i;
	                i--;
	            }
	        }
		return factores;
	}
}
