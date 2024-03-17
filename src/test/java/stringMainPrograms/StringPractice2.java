package stringMainPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class StringPractice2 {

	// Find reverse of string by string builder
	public static void main1(String[] args) {
		String str = "hrishabh kushwah";
		StringBuilder sb = new StringBuilder(str).reverse();
		System.out.print(sb.toString());
	}

	// find reverse string character by string buffer
	public static void main2(String[] args) {
		String str = "kushwah hrishabh";
		StringBuffer sb = new StringBuffer(str).reverse();
		System.out.print(sb.toString());
	}

	// find reverse with using reverse function
	public static void main3(String[] args) {
		String str = "hrishabh kushwah";
		String nstr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			nstr = ch + nstr;
		}
		System.out.print(nstr);
	}

	// reverse by character array
	public static void main4(String[] args) {
		String str = "kushwah";
		char[] ch = str.toCharArray();
		int first = 0;
		int last = ch.length - 1;
		while (first < last) {
			char temp = ch[first];
			ch[first] = ch[last];
			ch[last] = temp;
			first++;
			last--;
		}
		System.out.print(new String(ch));
	}

	// by collection list
	public static void main5(String[] args) {
		String input = "this is my code";
		char[] str = input.toCharArray();
		List<Character> reverse = new ArrayList<>();
		for (char c : str)
			reverse.add(c);
		Collections.reverse(reverse);
		ListIterator li = reverse.listIterator();
		while (li.hasNext()) {
			System.out.print(li.next());
		}
	}

	// find occurrence of character in string
	public static void main6(String[] args) {
		String input = "hrishabh kushwah";
		Map<Character, Integer> hashmap = new HashMap<>();
		for (char c : input.toCharArray()) {
			hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
		}
		System.out.println("Occurrence of each character:");
		for (Map.Entry<Character, Integer> entry : hashmap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	// find duplicate character from string
	public static void main8(String[] args) {
		String input = "my name is hrishabh kushwah";
		Map<Character, Integer> hashmap = new HashMap<>();
		for (char c : input.toCharArray()) {
			hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
		}
		System.out.print("Duplicate characters are:");
		for (Map.Entry<Character, Integer> entry : hashmap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}

	// finding the occurrence of words
	public static void main9(String[] args) {
		String input = "my name my name is hrishabh kushwah";// my-2 name-2 is-1 hrishabh-1 kushwah-1
		Map<String, Integer> hashmap = new HashMap<>();
		String[] words = input.split("\\s+");
		for (String word : words) {
			if (hashmap.containsKey(word)) {
				hashmap.put(word, hashmap.get(word) + 1);
			} else {
				hashmap.put(word, 1);
			}
		}
		System.out.println("Occurrence of words are:");
		for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	// finding the occurrence of duplicate words
	public static void main10(String[] args) {
		String input = "my my name is is hrishabh kushwah";
		Map<String, Integer> hashmap = new HashMap<>();
		String[] words = input.split("\\s+");
		for (String word : words) {
			if (hashmap.containsKey(word)) {
				hashmap.put(word, hashmap.get(word) + 1);
			} else {
				hashmap.put(word, 1);
			}
		}
		System.out.println("Duplicate words are:");
		for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}

	// find count
	public static void main11(String[] args) {
		String input = "my name is hrishabh kushwah";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			count++;
		}
		System.out.println(count);
	}

	// count uppercase and lowercase
	public static void main12(String[] args) {
		String str = "This";
		int ucount = 0;
		int lcount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				ucount++;
			} else {
				lcount++;
			}
		}
		System.out.println("count of uppercase letter:" + ucount);
		System.out.println("count of lowercase letter:" + lcount);
	}

	// replace uppercase to lowercase and lowercase to uppercase
	public static void main13(String[] args) {
		String str = "mY nAME iS hRISHABH";// My Name Is Hrishabh
		char[] currentChar = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				currentChar[i] = Character.toUpperCase(ch);
			} else if (Character.isLowerCase(ch)) {
				currentChar[i] = Character.toLowerCase(ch);
			}
		}
		System.out.println(currentChar);
	}

	// palidrome string
	public static void main14(String[] args) {
		String str = "tata";
		String nstr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			nstr = ch + nstr;
		}
		if (nstr.equalsIgnoreCase(str)) {
			System.out.println("String is palidrome");
		} else {
			System.out.println("String not palidrome!");
		}
	}

	// digit first then letter
	public static void main15(String[] args) {
		String str = "Hrishabh1234Kushwah45";// 12345HrishabhKushwah
		String digit = "";
		String letter = "";
		char temp = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (Character.isLetter(ch)) {
				letter = letter + ch;
			}
		}
		System.out.println(digit + letter);
	}

	// sum of interger in string
	public static void main16(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string:");
		String str =sc.nextLine();
		//String str = "H1R2I3S4H5";// 15
		int sum = calculateDigits(str);
		System.out.println(sum);
		sc.close();
	}
	public static int calculateDigits(String str) {
	    int sum = 0;
	    String temp = "";
	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        if (Character.isDigit(ch)) {
	            temp += ch;
	        } else {
	            if (!temp.isEmpty()) {
	                sum += Integer.parseInt(temp);
	                temp = "";  // Reset temp only if it's not empty
	            }
	        }
	    }
	    if (!temp.isEmpty()) {
	        sum += Integer.parseInt(temp);
	    }
	    return sum;
	}
	//swaping string without using third or temp variable
	public static void main17(String[] args) {
		String str1 = "good";
		String str2 = "morning";
		
		str1 = str1+str2;
		str2 = str1.substring(0,(str1.length()-str2.length()));
		str1 = str1.substring(str2.length());
		
		System.out.println(str1+str2);
		System.out.println(str2);
	}
	public static void main(String[] args) {
		String input = "hello world hrishabh kushwah";
		StringBuilder sb = new StringBuilder();
		String[]words = input.split("\\s+");
		for(int i=words.length-1;i>0;i--) {
			sb.append(words[i]).append(" ");
		}
		System.out.println(sb.toString());
	}
}
