package SecondDay;

public class DuplicateElements {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 7, 1, 5, 4 };

		System.out.print("Original array: ");
		printArray(arr);

		findDuplicates(arr);
	}

	public static void findDuplicates(int[] arr) {
		boolean foundDuplicate = false;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate element: " + arr[i]);
					foundDuplicate = true;
				}
			}
		}
		if (!foundDuplicate) {
			System.out.println("No duplicate elements found.");
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
