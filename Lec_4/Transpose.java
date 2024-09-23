package Lec_4;
import java.util.*;
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= new int [3][3];
		Scanner h = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=h.nextInt();
			}
		}
		print(arr);
		int tran[][]=new int [arr[0].length][arr.length];
		
		for (int i = 0; i < tran.length; i++) {
			for (int j = 0; j < tran[0].length; j++) {
				tran[i][j]=arr[j][i];
			}
		}
		print(tran);

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
