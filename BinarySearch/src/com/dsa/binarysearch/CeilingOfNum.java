package com.dsa.binarysearch;

public class CeilingOfNum {
	
	// ceiling = return the index of smallest >= target

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,5,6,9,12,15,33,49,88};
		int target=100;
		int searchNum = searchNum(arr,target);
		System.out.println(searchNum);

	}
	
	static int searchNum(int[] arr, int target) {
		if(target>=arr[arr.length-1]) {
			return -1;
		}
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}else if(target>arr[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return start;
	}

}
