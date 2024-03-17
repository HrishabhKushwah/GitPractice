package stringMainPrograms;

import java.util.ArrayList;
import java.util.*;

public class Practice2 {
	public static void main(String[] args) {
		String input = "this is my name is";
		Map<Character,Integer> hashmap = new HashMap<>();

		for(char c: input.toCharArray()) {
			hashmap.put(c, hashmap.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character, Integer>entry:hashmap.entrySet()) {
			if(entry.getValue()>1)
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	
	public static void main1(String[] args) {
		String str = "helloworld";
		StringBuilder sb = new StringBuilder(str).reverse();
		System.out.println(sb.toString());
	}

	public static void main2(String[] args) {
		String str = "helloworld";
		StringBuffer sb = new StringBuffer(str).reverse();
		System.out.println(sb.toString());
	}

	public static void main3(String[] args) {
		String str = "helloworld";
		String nstr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			nstr = ch + nstr;
		}
		System.out.println(nstr);
	}

	public static void main4(String[] args) {
		String str = "helloworld";
		char[] arr = str.toCharArray();
		int first = 0;
		int last = arr.length - 1;
		while (first < last) {
			char temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;
		}
		System.out.println(new String(arr));
	}

	public static void main5(String[] args) {
		String input = "helloworld";
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

	// finding the occurance of single character.
	public static void main6(String[] args) {
		String str = "helloworld";// char o - 2 times
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'o')
				count++;
		}
		System.out.println(count);
	}

	// finding the occurence of each character in a given string
	public static void main7(String[] args) {
		String input = "this is my code";
		Map<Character, Integer> hashmap = new HashMap<>();
		for (char c : input.toCharArray()) {
			hashmap.put(c, hashmap.getOrDefault(0, 1) + 1);
		}
		for (Map.Entry<Character, Integer> entry : hashmap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	public static void main8(String[] args) {
		String input = "There is no limit";
		Map<Character, Integer> hashmap = new HashMap<>();
		for (char c : input.toCharArray()) {
			hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : hashmap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}

	public static void main9(String[] args) {
		String str = "hrishabh hrishabh";
		char[] arr = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
					break;
				}
			}
		}
	}

	public static void main10(String[] args) {
		String str = "hrishabh kushwah";

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				if (currentChar == str.charAt(j)) {
					System.out.print(currentChar + " ");
					break;
				}
			}
		}
	}
	//finding duplicate word in string.
	public static void main11(String[] args) {
		String input = "There is no limit is there";
		Map<String,Integer> hashmap = new HashMap<>();
		String []words = input.split("\\s+");
		for(String word:words) {
			hashmap.put(word, hashmap.getOrDefault(word, 0)+1);
		}
		for(Map.Entry<String,Integer>entry:hashmap.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}
	public static void main12(String[] args) {
		String input = "my name is hrishabh yes is hrishabh";//is:2 hrishabh:2
		Map<String, Integer>hashmap = new HashMap<>();
		String []words =input.split("\\s+");
		for(String word:words) {
			hashmap.put(word, hashmap.getOrDefault(word,0)+1);
		}
		for(Map.Entry<String, Integer>entry:hashmap.entrySet()) {
			if(entry.getValue()>1)
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}

















