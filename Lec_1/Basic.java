package Lec_1;

class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add
		int a=5;
		int b=6;
		System.out.println(a+b);
		int c= a+b;
		
		if(c%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		
		//Write |
		
		int n=15;
		
		if(n%2==0) {
			System.out.println(n+" is div by 2");
		}
		else if (n%3==0) {
			System.out.println(n+" is div by 3");
		}
		else {
			System.out.println("sune bhai 2 aur 3 se dono se div nahi hain");
		}
		
		System.out.println(n%3==0);
		
		System.out.println(15>64);
		
		//looping
		// for(ins ;condition;inc/dec)
		
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		

	}

}
