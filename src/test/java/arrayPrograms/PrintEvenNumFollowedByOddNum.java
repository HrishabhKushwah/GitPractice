package arrayPrograms;

public class PrintEvenNumFollowedByOddNum {
	public static void main(String[] args) {
		int arr[] = {11,22,33,44,55};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0)
				System.out.print(arr[i]+" ");
		}
	}
}
