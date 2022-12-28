package AmitLearn;
import java.util.*;
public class SeperateEvenOddInArray {
	public static void main(String[] args) {
		int arr[] = {12, 34,8, 7,5,2, 45, 9, 90, 3};
		int left = 0, right = arr.length - 1;
		while (left < right){
			/* Increment left index while we see 0 at left */
			while (arr[left]%2 == 0 && left < right)
				left++;
			/* Decrement right index while we see 1 at right */
			while (arr[right]%2 == 1 && left < right)
				right--;
			if (left < right){
				/* Swap arr[left] and arr[right]*/
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(arr));
	} 
}
