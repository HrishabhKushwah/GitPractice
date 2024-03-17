package stringCharPrograms;

import java.util.Scanner;

//programs to find character counts in given string.

public class FindCharacters {
	public static void main() {
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String s = sc.nextLine();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			count++;
		}
		System.out.println(count);
	}
	
	public static void main1(String[] args) {
		int count=0; String s= "Kush";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			count++;
		}
		System.out.println(count);
	}
}
