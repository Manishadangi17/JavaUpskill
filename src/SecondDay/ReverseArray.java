package SecondDay;

public class ReverseArray {
	public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 1, 9, 4};
        
        System.out.print("Original array: ");
        printArray(arr);
        
        reverseArray(arr);
        
        System.out.print("Reversed array: ");
        printArray(arr);
    }
    
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
