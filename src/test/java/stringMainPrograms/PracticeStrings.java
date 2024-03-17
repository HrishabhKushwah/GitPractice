package stringMainPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class PracticeStrings {
//reverse
	
	public static void main1(String[] args) {
		String input = "helloworld";
		String revStr = "";
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			revStr = ch+revStr;
		}
		System.out.print(revStr);
	}
	public static void main2(String[] args) {
		String str = "helloworld";
		StringBuilder sb = new StringBuilder(str).reverse();
		System.out.print(sb.toString());
	}
	public static void main3(String[] args) {
		String str = "helloworld";
		StringBuffer sb = new StringBuffer(str).reverse();
		System.out.print(sb.toString());
	}
	public static void main4(String[] args) {
		String str = "helloworld";
		char[] arr = str.toCharArray();
		int first = 0;
		int last = arr.length-1;
		while(first<last) {
			char temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;
		}
		System.out.print(new String(arr));
	}
	public static void main5(String[] args) {
		String input = "my book";
		char [] str = input.toCharArray();
		List<Character>reverse = new ArrayList();
		for(char c:str)
			reverse.add(c);
		Collections.reverse(reverse);
		ListIterator li = reverse.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next());
		}
	}
	//duplicate finding
	public static void main(String[] args) {
		String input = "mybookk";
		char []arr = input.toCharArray();
		System.out.println("Duplicate characters in string are:");
		for(int i=0; i<input.length();i++) {
			for(int j=i+1; j<input.length();j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
					break;
				}
			}
		}
	}
}
