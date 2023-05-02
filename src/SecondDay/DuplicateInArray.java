package SecondDay;

import java.util.Arrays;

public class DuplicateInArray {
	public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 2, 4, 6, 7, 5 };
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Number of duplicates: " + count);
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newArr[index] = arr[i];
                index++;
            }
        }
        System.out.println("Array after removing duplicates: " + Arrays.toString(newArr));
    }

}
