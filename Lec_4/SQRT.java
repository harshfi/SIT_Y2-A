package Lec_4;

public class SQRT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(findSqrt(27));
	}
	public static int findSqrt(int x) {
		int s=1;
		int e=x;
		while(s<=e) {
			int mid=(s+e)/2;
			if(mid*mid==x) return mid;
			else if(mid*mid> x) e=mid-1;
			else s=mid+1;
		}
		return e;
	}

}
