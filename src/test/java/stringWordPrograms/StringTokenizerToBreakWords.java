package stringWordPrograms;

import java.util.StringTokenizer;

public class StringTokenizerToBreakWords {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("my name is hrishabh kushwah","");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}