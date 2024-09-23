package Lec_2;
import java.util.*;
public class factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
				System.out.println(i);
			}
		}

	}

}
