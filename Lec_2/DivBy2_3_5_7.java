package Lec_2;

public class DivBy2_3_5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=1000;i++) {
			
			if(i%2==0 && i%3==0 && i%5==0 && i%7==0) {
				System.out.println(i);
			}
		}

	}

}
