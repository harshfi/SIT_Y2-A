package Lec_3;

public class ArrayisPal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,6,2,1,5};
		int b[]= {6,4,6,4,6};
		System.out.println(isPal(a));
		System.out.println(isPal(b));
	}
	
	public static boolean isPal(int a[]) {
		int i=0;
		int j=a.length-1;
		while(i<=j) {
			if(a[i]!=a[j]) return false;
			i++;
			j--;
		}
		
		return true;
	}

}
