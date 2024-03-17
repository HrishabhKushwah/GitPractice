package stringMainPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseStringUsingArrayList {
	//Without using reverse function
	public static void main2(String[] args) {
		String str = "hello world";
		String nstr = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			nstr = ch+nstr;
		}
		System.out.print(nstr);
	}
	//Using a StringBuilder
	public static void main3(String[] args) {
		String str = "hello world";
		StringBuilder sb = new StringBuilder(str).reverse();
		System.out.print(sb.toString());
	}
	//Using a StringBuffer
	public static void main(String[] args) {
		String str = "hello world";
		StringBuffer sb = new StringBuffer(str).reverse();
		System.out.print(sb.toString());
	}
	//Using list collections
	public static void main7(String[] args) {
		String input = "helloworld";
		char[]str = input.toCharArray();
		List<Character> reverse = new ArrayList<>();
		for(char c:str)
			reverse.add(c);
		Collections.reverse(reverse);
		ListIterator li = reverse.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next());
		}
	}
	//Using char array
	public static void main8(String[] args) {
		String str = "helloworld";
		char []arr = str.toCharArray();
		int first = 0;
		int last = arr.length -1;
		while(first<last) {
			char temp = arr[first];
			arr[first] = arr[last];
			arr[last]=temp;
			first++;
			last--;
		}
		System.out.print(new String(arr));
	}
}