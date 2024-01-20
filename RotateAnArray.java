package RotateArray;

import java.util.Arrays;

public class RotateAnArray {
	
	public static void rotate(int[] arr, int position) {
		position = position % arr.length;
		reverseArray(arr,0,arr.length-1);
		reverseArray(arr,0,position-1);
		reverseArray(arr,position,arr.length-1);
	}
	
	public static void reverseArray(int[] arr,int start,int end) {
		
		
		while(start<end) {
			int temp = arr[start];
			arr [start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int arr[] = {16,23,54,55,64,43};
		int rotateposition =2;
		
		System.out.println("Original Array: "+ Arrays.toString(arr));
		rotate(arr,rotateposition);
		System.out.println("Rotated Array: "+ Arrays.toString(arr));
	}

}
