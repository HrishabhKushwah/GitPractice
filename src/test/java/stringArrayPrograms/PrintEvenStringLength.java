package stringArrayPrograms;

public class PrintEvenStringLength {
	// print all strings having even length.
	public static void main1(String[] args) {
		String arr[] = { "My", "Name", "is", "Hrishabh", "kumar", "Kushwah" };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() % 2 == 0)
				System.out.print(arr[i] + " ");
		}
	}
	// print all strings which starts with ku
	public static void main2(String[] args) {
		String arr[] = { "My", "Name", "is", "Hrishabh", "kumar", "kushwah" };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].startsWith("ku"))
				System.out.print(arr[i] + " ");
		}
	}
	// print all strings which end with h
	public static void main3(String[] args) {
		String arr[] = { "My", "Name", "is", "Hrishabh", "kumar", "kushwah" };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].endsWith("h"))
				System.out.print(arr[i] + " ");
		}
	}
	// print all strings which end with h
	public static void main(String[] args) {
		String arr[] = { "My", "Name", "is", "Hrishabh", "kumar", "kushwah" };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("a"))
				System.out.print(arr[i] + " ");
		}
	}
}