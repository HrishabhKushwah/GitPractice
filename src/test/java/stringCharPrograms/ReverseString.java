package stringCharPrograms;

public class ReverseString {
	public static void main(String[] args) {
		String s1 = "hrishabh kushwah";//hawhsuk hbahsirh
		String s2 = "";
 		for(int i=0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			s2 = ch+s2;
		}
 		System.out.println(s2);
	}
}
