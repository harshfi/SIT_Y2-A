package Lec_3;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner h = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
			arr[i]=h.nextInt();
		}
        System.out.println("Before updation");
        Print(arr);
        arr[1]=4;
        System.out.println("After the updation");
        Print(arr);
    
//         System.out.println(Sum(arr));
	}
	
	public static int Sum(int a[]) {
		int sum=0;
		for(int i=0;i<5;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
	
	public static void Print(int a[]) {
		for (int i = 0; i < 5; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
