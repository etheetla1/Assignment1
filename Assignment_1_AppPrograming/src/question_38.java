
public class question_38 {
	public static void main(String[] args) {
		int count = 0;

		for (int i = 2; i < 10000; i++) {
			if (isPrime(i)) {
				count++;
			}
		}

		System.out.println("The number of prime numbers less than 10000 is: " + count);
	}
	
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		if (number <= 3) {
			return true;
		}
		if (number % 2 == 0 || number % 3 == 0) {
			return false;
		}
	
		for (int i = 5; i * i <= number; i += 6) {
			if (number % i == 0 || number % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}
}
