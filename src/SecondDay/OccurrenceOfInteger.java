package SecondDay;

public class OccurrenceOfInteger {
	 public static void main(String[] args) {
	        int[] arr = {3, 5, 2, 7, 1, 5, 4};
	        int num = 5;
	        
	        System.out.print("Original array: ");
	        printArray(arr);
	        
	        int occurrence = findOccurrence(arr, num);
	        
	        System.out.println("Number of occurrences of " + num + ": " + occurrence);
	    }
	    
	    public static int findOccurrence(int[] arr, int num) {
	        int count = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == num) {
	                count++;
	            }
	        }
	        return count;
	    }
	    
	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

}
