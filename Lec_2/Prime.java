package Lec_2;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	boolean flag=true;
	int n=21;
	
	for(int i=2;i<=(n-1);i++)
	{
		if(n%i==0) {
			flag=false;
			System.out.println("Sune bhai ye prime number nahi hain");
			break;
		}
	}
	if(flag==true)System.out.println("Sune number toh prime hain");

	}

}
