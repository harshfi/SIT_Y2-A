package Lec_4;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,7,9,10,10,15,18,33};
		System.out.println(BS(a,18));
		System.out.println(BS(a,8));

	}
	public static int BS(int a[], int target) {
		int s=0;
		int e= a.length-1;
		while(s<=e) {
			int mid=(s+e)/2;
			if(a[mid]==target) {
				return mid; 
			}
			else if(a[mid]<target) {
				s=mid+1;
			}
			else e=mid-1;
		}
		return -1;
	}

}
