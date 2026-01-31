package com.CoreJava;

public class Duplicate_handle {

	public static int countDuplicate(int[] arr) {
		int n = arr.length;
		int duplicate = 0;
		if(n == 0) {
			return -1;
		}
		for(int i = 1; i<n; i++) {
			if(arr[i] == arr[i-1]) {
				duplicate++;
			}
		}
		return duplicate;
	}
		public static void main(String[] args) {
			Duplicate_handle dup = new Duplicate_handle();
		int arr[] = {1,1,1,2,3,4,5,5};
		int res = dup.countDuplicate(arr);
		System.out.println(res);
	}
}
