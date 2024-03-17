package stringCharPrograms;

import java.util.Scanner;

//Program to check string is palindrome or not!....

public class PalindromeString {
	public static void main1(String[] args) {
		String s1 = "ADA";
		String s2 = "";
		for(int i=0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			s2 = ch+s2;
		}
		System.out.println(s2);
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("String is palindrome!");
		}
		else {
			System.out.println("String is not palindrome!");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s1 = sc.nextLine();
		String s2 = "";
		for(int i=0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			s2 = ch+s2;
		}
		System.out.println(s2);
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("String is palindrome!");
		}
		else {
			System.out.println("String is not palindrome!");
		}
	}
}
