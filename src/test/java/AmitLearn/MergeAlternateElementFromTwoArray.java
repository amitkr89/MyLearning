package AmitLearn;
import java.util.*;

public class MergeAlternateElementFromTwoArray {

	public static void main(String[] args) {
		int arr1[] = { 2,7,5 };
		int l1 = arr1.length;
		int arr2[] = { 3,6,9};
		int l2 = arr2.length;
		int arr3[] = new int[l1 + l2];
		int i = 0, j = 0, k = 0;
		// Traverse both array
		while (i < l1 && j < l2) {
			arr3[k++] = arr1[i++];
			arr3[k++] = arr2[j++];
		}
		// Store remaining elements of first array
		while (i < l1)
			arr3[k++] = arr1[i++];
		// Store remaining elements of second array
		while (j < l2)
			arr3[k++] = arr2[j++];
		System.out.println(Arrays.toString(arr3));
	}  
}  
