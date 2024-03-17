package arrayPrograms;

public class PrintASCIValueOfGivenCharArray {
	public static void main(String[] args) {
		char arr[] = {'a','b','c','d'};
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+1+" "+arr[i]+" "+(int)arr[i]);
		}
	}
}
