package Lec_2;
import java.util.*;
public class SumofOddPlace_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner h= new Scanner(System.in);
     int n=h.nextInt();
     int even=0;
     int odd=0;
     int cnt=1;
     while(n>0) {
    	 
    	 int d=n%10;
    	 
    	 if(cnt%2==0)even=even+d;
    	 
    	 else odd=odd+d;
    	 
    	 n=n/10;
    	 cnt++;
     }
     System.out.println(even);
     System.out.println(odd);
	}

}
