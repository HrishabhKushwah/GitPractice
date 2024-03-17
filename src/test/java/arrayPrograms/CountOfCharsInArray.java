package arrayPrograms;

public class CountOfCharsInArray {
	public static void main(String[] args) {
		char arr[] = {'a','b','c','d'};
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(Character.isUpperCase(arr[i]))
				System.out.println(arr[i]);
				count++;
		}
		System.out.println(count);
	}
}
