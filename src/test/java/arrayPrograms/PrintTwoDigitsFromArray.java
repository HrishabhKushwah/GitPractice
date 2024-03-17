package arrayPrograms;

public class PrintTwoDigitsFromArray {
	//Print two digits 
	public static void main1(String[] args) {
		int arr [] = {1,3,22,5,23,4,24,333};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>5&&arr[i]<=24)
				System.out.println(arr[i]+" ");
		}
 	}
	//print positive numbers
	public static void main2(String[] args) {
		int arr [] = {1,-3,22,5,-23,4,24,333};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0)
				System.out.println(arr[i]+" ");
		}
 	}
	//divisable by 5
	public static void main3(String[] args) {
		int arr [] = {1,-3,20,10,5,-25,4,24,350};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%5==0)
				System.out.println(arr[i]+" ");
		}
 	}
	//ending with 5
		public static void main(String[] args) {
			int arr [] = {1,3,25,10};
			for(int i=0; i<arr.length; i++) {
				if(arr[i]%10==5)
					System.out.println(arr[i]+" ");
			}
	 	}
}
