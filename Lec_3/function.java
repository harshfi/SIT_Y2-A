package Lec_3;

public class function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fun();
		sum(2,3);
		System.out.println(sum(3,4));
		System.out.println(sum(5,4));

	}
	public static void fun() {
		fun1();
		System.out.println("Hi im in a function");
	}
	public static void fun1() {
		System.out.println("Hi im in a function  1");
	}
	
	public static int sum(int a,int b) {
		return (a+b);
	}

}
