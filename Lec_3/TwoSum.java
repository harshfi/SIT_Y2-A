package Lec_3;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int target=3;
		int arr[]= {5,2,1,5,2,4};
		
		System.out.println(twosum(arr,target));

	}
	public static boolean twosum(int arr[],int target) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					
					System.out.println(i+" "+j);
					return true;
				}
			}
		}
		return false;
	}

}
