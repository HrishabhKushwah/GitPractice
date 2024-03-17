package stringMainPrograms;
import java.util.HashMap;
import java.util.Map;
public class StringOccurance {
	//Occurrence of given char in string
	public static void main1(String[] args) {
	String str = "this tis tmy tbook";
	int count = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='t')
				count++;}
		System.out.println(count);
		}	
	//using hashmap occurrence of given char in string
	//HashMap stores key and value pairs and does not hold the duplicate key.
	//The program stores character as a key and the occurrence of character as a value.
	public static void main5(String[] args) {
		String input = "hrishabh kushwah";
		Map<Character,Integer>hashmap = new HashMap<>();
		for(char c:input.toCharArray()) {
			hashmap.put(c, hashmap.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character,Integer>entry:hashmap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	//duplicate characters in a string
	public static void main8(String[] args) {
		String str = "hrishabh";
		char[]arr = str.toCharArray();
		for(int i=0; i<str.length();i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+" ");
					break;
				}}}}
	//duplicate character by hashmap
	public static void main(String[] args) {
        String str = "hrishabh";
        Map<Character, Integer> hashmap = new HashMap<>();
        for (char c : str.toCharArray()) {
        	hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
        }
        System.out.println("Duplicate characters in '" + str + "':");
        for (Map.Entry<Character, Integer> entry : hashmap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }}}

//sum of digit value in string
public static void main7(String[] args) {
String str = "this1 is2 my3 string4";
int sum = 0;
	for(int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		if(Character.isDigit(ch)) {
			sum+=Character.getNumericValue(ch);
		}}System.out.print(sum);}
}






