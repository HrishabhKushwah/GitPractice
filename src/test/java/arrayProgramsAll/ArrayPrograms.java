package arrayProgramsAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class ArrayPrograms {

	// print array elements
	public static void main1(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// Program to copy all elements of one array into another array
	public static void main2(String[] args) {
		int[] sourcearr = { 11, 22, 33, 44, 55 };
		int[] destarr = new int[sourcearr.length];
		for (int i = 0; i < sourcearr.length; i++) {
			destarr[i] = sourcearr[i];
		}
		System.out.println("source array:");
		for (int num : sourcearr) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("destination array:");
		for (int num : destarr) {
			System.out.print(num + " ");
		}
	}

	// Program to find the frequency of each element in the array
	public static void main3(String[] args) {
		int[] array = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		Map<Integer, Integer> hashmap = new HashMap<>();
		for (int num : array) {
			if (hashmap.containsKey(num)) {
				hashmap.put(num, hashmap.get(num) + 1);
			} else {
				hashmap.put(num, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
			System.out.println("Number: " + entry.getKey() + " occurs: " + entry.getValue() + " times.");
		}
	}

	// Program to print the duplicate elements of an array
	public static void main5(String[] args) {
		int[] arr = { 1, 2, 1, 3, 4, 5, 4 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}

	// Program to print the duplicate elements of an array [hashmap]
	public static void main6(String[] args) {
		int[] input = { 1, 2, 1, 3, 5, 6, 4, 5, 7 };
		Map<Integer, Integer> hashmap = new HashMap<>();
		for (int num : input) {
			hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
		}
		System.out.print("Duplicate numbers are:");
		for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(" " + entry.getKey() + " ");
			}
		}
	}

	// Program to print the elements of an array in reverse order
	public static void main7(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.print("Original array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.print("Reversed array:");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

	// by list iterator : reverse
	public static void main8(String[] args) {
		int[] input = { 1, 2, 3, 4, 5 };
		List<Integer> reverse = new ArrayList<>();
		for (int i = input.length - 1; i >= 0; i--) {
			reverse.add(input[i]);
		}
		ListIterator li = reverse.listIterator();
		while (li.hasNext()) {
			System.out.print(li.next());
		}
	}

	// by swapping : reversed
	public static void main9(String[] args) {
		int[] input = { 1, 2, 3, 4, 5 };
		int start = 0;
		int end = input.length - 1;
		while (start < end) {
			int temp = input[start];
			input[start] = input[end];
			input[end] = temp;
			start++;
			end--;
		}
		for (int num : input) {
			System.out.print(num);
		}
	}

	// Using an additional array: reverse
	public static void main10(String[] args) {
		int[] orgarr = { 1, 2, 3, 4, 5 };
		int[] addarr = new int[orgarr.length];
		for (int i = 0; i < orgarr.length; i++) {
			addarr[i] = orgarr[orgarr.length - 1 - i];
		}
		for (int num : addarr) {
			System.out.print(num);
		}
	}

	// collection reverse
	public static void main11(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5 };
		List<Integer> rev = Arrays.asList(arr);
		Collections.reverse(rev);
		for (int num : rev) {
			System.out.print(num + " ");
		}
	}

	// Program to print the smallest element in an array
	public static void main12(String[] args) {
		int[] arr = { 11, 6, 7, 12, 15 };// find smallest
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.print("Smallest element:" + min);
	}

	// Program to print the largest element in an array
	public static void main13(String[] args) {
		int[] arr = { 12, 13, 14, 16, 15, 11 };// 16
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("largest element:" + max);
	}

	// Java Program to print the sum of all the items of the array
	public static void main14(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; // sum = sum+arr[i];
		}
		System.out.println("Sum of elements:" + sum);
	}

	// Java Program to sort the elements of an array in ascending order
	// Arrays.sort(array) - another way
	public static void main15(String[] args) {
		int[] arr = { 5, 2, 8, 7, 1 };
		int temp = 0;
		System.out.println("Before sorting:");
		for (int i = 0; i < arr.length; i++) {// 0 5
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("After sorting:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	// Java Program to sort the elements of an array in descending order
	// Arrays.sort(array, Collections.reverseOrder()); another way
	public static void main16(String[] args) {
		int[] arr = { 5, 2, 8, 7, 1 };
		int temp = 0;
		System.out.println("Before sorting:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("After sorting:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// Java Program to Find 2nd and 3rd Largest Number in an array
	public static int findSecondLargest(int arr[], int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[total - 2];// return arr[total-3];
	}

	public static void main19(String[] args) {
		int arr[] = { 44, 33, 55, 11, 22 };
		System.out.println("Second largest:" + findSecondLargest(arr, 5));
	}

	// Java Program to Find Largest Number in an array
	public static void main17(String[] args) {
		int[] arr = { 11, 22, 55, 44, 33 };
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
		}
		System.out.println(largest);
	}

	// Java to Program Find 2nd Smallest Number in an array
	public static int findSecondSmallest(int arr[], int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1];
	}

	public static void main20(String[] args) {
		int arr[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Second smallest:" + findSecondSmallest(arr, 7));
	}

	// Java Program to Find Smallest Number in an array
	public static void main18(String[] args) {
		int[] arr = { 22, 11, 33, 55, 44 };
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest)
				smallest = arr[i];
		}
		System.out.println(smallest);
	}

	public static void main21(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 1; i < arr.length; i += 2) {
			System.out.println(arr[i]);
		}
	}

	// Program to print the elements of an array present on even position
	public static void main23(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 1; i < arr.length; i += 2) {
			System.out.println(arr[i]);
		}
	}

	// Program to print the elements of an array present on odd position
	public static void main22(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i += 2) {
			System.out.println(arr[i]);
		}
	}

	// Java Program to Print Odd and Even Numbers from an array
	public static void main24(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Odd numbers are:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("Even numbers are:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
	// Program to left rotate the elements of an array
	public static void main26(String[] args) {
		int[]arr = {1,2,3,4,5};
		int n = 1;
		System.out.println("Before rotate:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		int j;
		for(int i=0; i<n; i++) {
			int first = arr[0];
			for(j=0; j<arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[j] = first;
		}
		
		System.out.println();
		System.out.println("After rotate");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	// Java Program to right rotate the elements of an array
	public static void main27(String[] args) {
		int[]arr = {1,2,3,4,5};
		int n = 3;
		System.out.println("Before rotate:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		int j;
		for(int i=0; i<n; i++) {
			int last = arr[arr.length-1];
			for(j=arr.length-1; j>0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
		
		System.out.println();
		System.out.println("After rotate");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	// Java Program to Remove Duplicate Element in an array
}