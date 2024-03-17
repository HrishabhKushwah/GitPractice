package arrayPrograms;

public class SumOfEvenNumbers {
	//even
	public static void main1(String[] args) {
		int arr[] = {11,22,33,44,55};
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0)
				sum = sum+arr[i];
		}
		System.out.println(sum);
	}
	//odd
	public static void main2(String[] args) {
		int arr[] = {11,22,33,44,55};
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0)
				sum = sum+arr[i];
		}
		System.out.println(sum);
	}
	//sum of two digits
	public static void main3(String[] args) {
		int arr[] = {1,22,3,44,5};
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>5&&arr[i]<50)
				sum = sum+arr[i];
		}
		System.out.println(sum);
	}
	//sum of positive numbers
	public static void main(String[] args) {
		int arr[] = {1,-22,3,-44,5};
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0)
				sum = sum+arr[i];
		}
		System.out.println(sum);
	}
}
