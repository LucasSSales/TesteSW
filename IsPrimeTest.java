package TestSW.Aula0731;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class IsPrimeTest {
	
	int[] primeList = {11,	13,	17,	19, 95989, 91801, 88007, 82351, 104729, 103399, 63527, 89989, 90001, 90007, 2999 };
	int[] noPrimeList = {121, 12, 20, 325, 1000, 77, 12345678, 9000, 8};
	
	@Test
	void testeListIsPrime() {
		
		for (int i : primeList) 
			assertTrue(isPrime.is_prime(i), "Erro no elemento: " + i);
		
//		assertAll(
//			() -> {
//				for (int i : this.primeList) 
//					assertTrue(isPrime.is_prime(i), "Erro no elemento: " + i);
//			},
//			
//			() -> {
//				for (int i : this.noPrimeList) 
//					assertFalse(isPrime.is_prime(i), "Erro no elemento: " + i);
//			},
//			
//			"ERRO");
		
	}
	
	@Test
	void testeListIsNotPrime() {
		
		for (int i : noPrimeList) 
			assertFalse(isPrime.is_prime(i), "Erro no elemento: " + i);
		
		
	}
	

}
