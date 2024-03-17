package stringArrayPrograms;
//extract first four characters
public class ExtractFirstFourChars {
	public static void main1(String[] args) {
		String arr[] = {"abcdse","gdgdgdf","weetwwe","utyuty"};
		for(int i=0; i<arr.length; i++) {
			String s2 = arr[i].substring(0, 4);
			System.out.print(s2+" ");
		}
	}
	public static void main2(String[] args) {
		String arr[] = {"abcdse","gdgdgdf","weetwwe","utyuty"};
		for(int i=0; i<arr.length; i++) {
			String s1 = arr[i].toUpperCase();
			System.out.println(s1+" ");
		}
	}
	public static void main(String[] args) {
		String arr[] = {"AHDKHKD","DKLJDL","DNSDKLSK","FENF"};
		for(int i=0; i<arr.length; i++) {
			String s1 = arr[i].toLowerCase();
			System.out.println(s1+" ");
		}
	}
}


