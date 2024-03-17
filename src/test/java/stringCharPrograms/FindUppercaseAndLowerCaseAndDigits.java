package stringCharPrograms;

//programs to find uppercase, lowercase, digits and whitespaces in given strings.

public class FindUppercaseAndLowerCaseAndDigits {
	public static void main() {
		String s = "Hrishabh KuShwah";//HKS
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch))
				System.out.print(ch);
		}
	}
	public static void main1() {
		String s = "Hrishabh Kushwah";//rishabh ushwah
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch))
				System.out.print(ch);
		}
	}
	public static void main2(String[] args) {
		String s = "hrishabh 123 kush 456";//123456
		for(int i =0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch))
				System.out.print(ch);
		}
	}
	public static void main(String[] args) {
		String s = "hrishabh 123 kush 456";//hrishabhkush
		for(int i =0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isLetter(ch))
				System.out.print(ch);
		}
	}
	public static void main3(String[] args) {
		String s = "hrishabh 123 kush 456";//3 white spaces
		for(int i =0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isWhitespace(ch))
				System.out.println(ch);
		}
	}
	
}