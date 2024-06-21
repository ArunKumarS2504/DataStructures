package Arrays;

import java.util.Arrays;

public class SelectionSort {
	
	public static void Sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min = arr[i];
			int minIndex= i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<min){
					min=arr[j];
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
			
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {4,5,3,2,4,62,1};
		SelectionSort.Sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
