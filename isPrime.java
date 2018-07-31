package TestSW.Aula0731;

public class isPrime {
		
	public static boolean is_prime(int number) {
		if(number <= 1 || (number != 2 && number%2 == 0))
			return false;
		
		for(int check = 3; check <= (int)Math.sqrt(number); check++){
			if(number % check == 0)
				return false;
		}
		return true;
	}

}
