public class test10{
	public static void main(String[] args) {
		final int NUMBER_OF_PALINDROMIC_PRIMES= 100; 
		final int NUMBERS_PER_LINE = 10;

		int count = 0;
		int n = 2;	
		while (count < NUMBER_OF_PALINDROMIC_PRIMES) {
			if (isPalindromicPrime(n)) {
				count++;
				System.out.print(count % NUMBERS_PER_LINE == 0 ? n + "\n" : n + " ");
			}
			n++; 
		}
	}
	  
	public static boolean isPalindromicPrime(int num) {
		return PrimeNumberMethod.isPrime(num) && test10.isPalindrome(num);
	}
}