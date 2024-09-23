package Lec_2;

public class N_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int n=2;n<1000;n++) {
			boolean flag=true;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println(n);
			}
		}

	}

}
