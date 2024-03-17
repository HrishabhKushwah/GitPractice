package arrayPrograms;

public class UppercaseCharsInArray {
	//uppercase
	public static void main1(String[] args) {
		char arr[] = {'a','B','c','D'};
		for(int i=0; i<arr.length; i++) {
			if(Character.isUpperCase(arr[i]))
				System.out.print(arr[i]+" ");
		}
	}
	//lowercase
	public static void main2(String[] args) {
		char arr[] = {'a','B','c','D'};
		for(int i=0; i<arr.length; i++) {
			if(Character.isLowerCase(arr[i]))
				System.out.print(arr[i]+" ");
		}
	}
	//digits
	public static void main3(String[] args) {
		char arr[] = {'a','1','c','2'};
		for(int i=0; i<arr.length; i++) {
			if(Character.isDigit(arr[i]))
				System.out.print(arr[i]+" ");
		}
	}
	//remove white space
	public static void main(String[] args) {
		char arr[] = {'a','B','c','D'};
		for(int i=0; i<arr.length; i++) {
			if(Character.isWhitespace(arr[i]))
				System.out.print(arr[i]+" ");
		}
	}
}
