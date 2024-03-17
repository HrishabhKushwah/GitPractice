package stringCharPrograms;

public class CreateNewStringByUpperCaseAndLowercaseChars {
	public static void main1(String[] args) {
		String s = "My Name Is Hrishabh Kushwah";
		String nstr="";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch))
				nstr = nstr+ch;
		}
		System.out.println(nstr);
	}
	public static void main2(String[] args) {
		String s = "My Name Is Hrishabh Kushwah";
		String nstr ="";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch))
				nstr = nstr+ch;
		}
		System.out.println(nstr);
	}
	public static void main(String[] args) {
		String s = "My Name Is Hrishabh Kushwah 12 12";
		String ustr="", nstr="",wstr="",lstr="",dstr="", lestr="";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch))
				ustr = ustr+ch;
			if(Character.isLowerCase(ch))
				lstr = lstr+ch;
			if(Character.isWhitespace(ch))
				wstr = wstr+ch;
			if(Character.isLetter(ch))
				lestr = lestr+ch;
			if(Character.isDigit(ch))
				dstr = dstr+ch;
		}
		System.out.println("Uppercase:"+ustr+"Lowercase:"+lstr+"Whitespaces:"+wstr+"Letters:"+lestr+"Digits"+dstr);
	}
}
