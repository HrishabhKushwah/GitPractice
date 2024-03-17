package arrayPrograms;

public class PrintEvenOrOddNumberFromArray {
	//printing even elements.
	public static void main1(String[] args) {
		int arr[] = {11,22,33,44,55};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0)
			System.out.print(arr[i]+" ");
		}
	}
	
	//printing odd elements of array.
	public static void main2(String[] args) {
		int arr[] = {11,22,33,44,55};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0)
			System.out.print(arr[i]+" ");
		}
	}
	//odd index
	public static void main3(String[] args) {
		int arr[] = {11,22,33,44,55};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0)
			System.out.print(i+" ");
		}
	}
	//even index
	public static void main(String[] args) {
		int arr[] = {11,22,33,44,55};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0)
			System.out.print(i+" ");
		}
	}
}
