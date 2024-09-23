package Lec_4;
import java.util.*;
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= new int [4][3];// 4rows and 3 cols
		Scanner h = new Scanner (System.in);
		  arr[2][1]=12;
//		  print(arr);
		  
		  for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=h.nextInt();
			}
		}
		  print(arr);
		  
		

	}
	public static void print(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
