package Lec_2;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner h= new Scanner(System.in);
       int n= h.nextInt();
       int sum=0;
       while(n>0) {
    	   int d=n%10;
    	   sum=sum+d;
    	   n=n/10;
       }
       System.out.println(sum);
//      return sum;
       
	}

}
