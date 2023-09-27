public class HundredthPrime {
    public static void main(String[] args) {
		int num = 1;
		int count = 0;

		while (count < 100) {
			num++;
			for (int divisor = 2; divisor <= num; divisor++) {
				if (divisor == num) {
					count++;
				}
				if (num % divisor == 0) {
					break;
				}
			}
		}
		System.out.println(num);
    }
}