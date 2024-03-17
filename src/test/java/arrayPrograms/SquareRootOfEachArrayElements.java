package arrayPrograms;

public class SquareRootOfEachArrayElements {
	//find square root
	public static void main1(String[] args) {
		int arr[] = {2,3,4,5};
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%.2f\n",Math.sqrt(arr[i]));
		}
	}
	//find the cube
	public static void main(String[] args) {
		int arr[] = {2,3,4,5};
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%.2f\n",Math.pow(arr[i],3));
		}
	}
}
