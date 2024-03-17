package stringWordPrograms;

import java.util.HashMap;
import java.util.Map;

//program to find the frequency of character.
public class FrequencyOfCharacters {
	public static void main(String[] args) {
		String input = "my name is hrishabh kushwah";
		Map<Character, Integer> hashmap = new HashMap<>();
		for(char ch : input.toCharArray()) {
			if(ch!=' ')
			hashmap.put(ch,hashmap.getOrDefault(ch, 0)+1);
		}
		for(char ch : hashmap.keySet()) {
			System.out.println("Character: "+ch+ " :"+ hashmap.get(ch)+ " times");
		}
	}
}
