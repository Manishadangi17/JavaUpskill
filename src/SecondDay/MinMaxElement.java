package SecondDay;

public class MinMaxElement {
	 public static void main(String[] args) {
	        int[] arr = {3, 5, 2, 7, 1, 9, 4};
	        
	        int min = findMin(arr);
	        int max = findMax(arr);
	        
	        System.out.println("Minimum element: " + min);
	        System.out.println("Maximum element: " + max);
	    }
	    
	 public static int findMin(int[] arr) {
	        int min = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        return min;
	    }
	    
	    public static int findMax(int[] arr) {
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }
	}


