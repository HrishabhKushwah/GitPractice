package arrayPrograms;

public class FindMaxAndMinNumbers {
	public static void main(String[] args) {
		int arr[] = {11,22,33,44,55};
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println("Max number:"+max);
		System.out.println("Min number:"+min);
	}
}
