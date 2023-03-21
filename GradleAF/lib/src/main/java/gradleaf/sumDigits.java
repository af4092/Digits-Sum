package gradleaf;

public class sumDigits {
	public static int sumDigits(long n) {
		int sum = 0;
		while(n>0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
}
