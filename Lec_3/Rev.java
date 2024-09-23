package Lec_3;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4325; //5234
		
		int rev=0;
		while(n>0) {
			int d=n%10;//last digit
			rev=(rev*10)+d;
			n=n/10;
		
		}
		
		System.out.println(rev);
				

	}

}
