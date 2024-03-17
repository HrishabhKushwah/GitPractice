package arrayPrograms;

public class ProductOfEvenAndOddNumbers {
	// find the product of even numbers
	public static void main1(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int product = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				product = product * arr[i];
		}
		System.out.println(product);
	}

	// find the product of odd numbers
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int product = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				product = product * arr[i];
		}
		System.out.println(product);
	}
}