package stringCharPrograms;

//All uppercase to lowecase and lowercase to uppercase.

public class ReverseCase {
	public static void main(String[] args) {
		String s1 = "Hrishabh Kushwah";//hRISHABH kUSHWAH
		String s2 = "", s3="";
		for(int i=0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			if(Character.isUpperCase(ch)) {
				s2 = s2+Character.toLowerCase(ch); 
			}
			else {
				s2 = s2+Character.toUpperCase(ch);
			}
		}
		System.out.println(s2);
	}
}
