package stringCharPrograms;

public class CountUppercaseLowercaseDigitsAndLetters {
	public static void main1(String[] args) {
		String s = "HrisHabh 72 KusHwah 21";
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch))
				count++;
		}
		System.out.println(count);
	}
	public static void main2(String[] args) {
		String s = "HrisHabh 72 KusHwah 21";
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch))
				count++;
		}
		System.out.println(count);
	}
	public static void main3(String[] args) {
		String s = "HrisHabh 72 KusHwah 21";
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch))
			count++;
		}
		System.out.println(count);
	}
	public static void main4(String[] args) {
		String s = "HrisHabh 72 KusHwah 21";
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isLetter(ch))
			count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		String s = "HrisHabh 72 KusHwah 21";
		int ucount = 0,lcount=0,dcount=0, wcount=0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch))
				ucount++;
			if(Character.isLowerCase(ch))
				lcount++;
			if(Character.isDigit(ch))
				dcount++;
			if(Character.isWhitespace(ch))
				wcount++;
		}
		System.out.println("Uppercase:"+ucount+" "+"Lowercase:"+lcount+" "+"Digits:"+dcount+" "+ "wcount:"+wcount);
	}
}