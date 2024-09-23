package Lec_4;

public class Liner_Search {
	public static void main(String[] args) {
		int a[]= {4,6,7,10,12,15,18,19};
		int target1=14;
		int target2=18;
		System.out.println(linerSearch(a,target1));
		System.out.println(linerSearch(a,target2));
		
		

	}
	public static boolean linerSearch(int a[],int target) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==target) {
				return true;
			}
		}
		return false;
	}
}
