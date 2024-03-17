package basicPrograms;
//1 or divided by 1
//2 3 5 7 9 
public class PrimeNumber {
	public static void main(String[] args) {
		int count = 10;
		for(int i=2; i<=count; i++) {
			if(i%count==0) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}
		}
	}
	public static int isPrime() {
		return 0;
	}
}
