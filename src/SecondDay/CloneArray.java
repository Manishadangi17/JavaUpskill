package SecondDay;
import java.util.Arrays;

public class CloneArray {
	public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] clonedArray = originalArray.clone();
        
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Cloned Array: " + Arrays.toString(clonedArray));
    }

}
