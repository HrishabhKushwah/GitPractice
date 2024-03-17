package stringCharPrograms;

public class NumberFirstAndThenString {
	public static void main() {
		String s = "Hris34habh26sound";
		String s1 = "", s2 = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				s1 = s1 + ch;
			} else {
				s2 = s2 + ch;
			}
		}
		String s3 = s1 + s2;
		System.out.println(s3);
	}

//	public static void main(String[] args) {
//		String s = "Hris34habh26sound";
//		String s1="";
//		String temp = "";
//		int sum = 0;
//		for(int i=0; i<s.length(); i++) {
//			char ch = s.charAt(i);
//			if(Character.isDigit(ch)) 
//				temp+=ch;
//		}
//        sum += Integer.valueOf(temp);
//		System.out.println(temp);
//	}

	public static void main(String[] args) {
		String str = "2k2k2k2k";//sum 8
		int sum=0; String temp="";
		char [] array = str.toCharArray();
		for(int i=0; i<array.length; i++) {
			char ch = array[i];
			if(Character.isDigit(ch)) {
				temp+=ch;
			}
			else {
				if(temp!="") {
					sum+=Integer.valueOf(temp);
					temp="";
				}
			}
		}
		if(temp!="") {
			sum+=Integer.valueOf(temp);
		}
		System.out.println(sum);
	}			
	
	public static void main6() {
		String str = "1h2t3";

		char[] array = str.toCharArray();
		int sum = 0;
		String temp = "";

		for (int i = 0; i < array.length; i++) {
			char c = array[i];
			if (Character.isDigit(c)) {
				temp += c;
			} else {
				if (temp != "") {
					sum += Integer.valueOf(temp);
					temp = "";
				}
			}
		}
		if (temp != "") {
			sum += Integer.valueOf(temp);
		}
		System.out.println(sum);
	}
}
