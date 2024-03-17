package arrayPrograms;

public class CountElementsFromArray {
	public static void main(String[] args) {
		int arr[] = {11,22,33,44,55};
		int count=0;
		for(int i=0; i<arr.length; i++) {
			count+=arr[i];
		}
		System.out.println(count);
	}
}
