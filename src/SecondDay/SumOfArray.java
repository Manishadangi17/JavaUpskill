package SecondDay;

public class SumOfArray {
	    public static void main(String[] args) {
	        printSum(new int[]{1, 2, 3, 4, 5});
	    }
	    
	    public static void printSum(int[] arr) {
	        int sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }
	        System.out.println("Sum of array elements: " + sum);
	    }
	}



