package Arrays;

public class minMax {

	public static void main(String[] args) {
		int arr[]= {2,43,454,1,0};
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("max element in array is"+max);
		
		int min=arr[0]; //0
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) { 
				min=arr[i];
			}
		}
		
		System.out.println("min element in arrray"+min);
		
	}
}
