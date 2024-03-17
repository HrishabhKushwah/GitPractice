package stringMainPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringByWords {
	// find occurrence of words in string
	public static void main1(String[] args) {
		String str = "Alice is girl and Bob is boy";
		Map<String, Integer> hashmap = new HashMap<>();
		String[] words = str.split(" ");
		for (String word : words) {

			if (hashmap.containsKey(word))
				hashmap.put(word, hashmap.get(word) + 1);
			else {
				hashmap.put(word, 1);
			}}
		// Display the word occurrences
		System.out.println("Word occurrences in the given string:");
		for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
		}}
	// find duplicate word
	
	public static void main(String[] args) {
		String expression = "Hi, I am Hritik and I am a programmer";
		String[] words = expression.split("\\W");
		Map<String, Integer> word_map = new HashMap<>();
		for (String word : words) {
			if (word_map.get(word) != null) {
				word_map.put(word, word_map.get(word) + 1);
			} else {
				word_map.put(word, 1);
			}
		}
		Set<String> word_set = word_map.keySet();
		for (String word : word_set) {
			if (word_map.get(word) > 1)
				System.out.println(word);
		}}}