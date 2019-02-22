package TestPkg1;

import java.util.Scanner;

public class PrimeNoJavaProgram {

	public boolean IsPrimeNumber(int m)
	{
	for(int i=2;i<=m;i++)
	{
		if(m%i==0)
		{
		return false;	
		}
	}
		return true;
		
		}
	
public static void main(String[] args) {
		PrimeNoJavaProgram p=new PrimeNoJavaProgram();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value");
	int n=	input.nextInt();
	if(p.IsPrimeNumber(n))
	{
		System.out.println(n + " " + "is a prime number");
	}
	else
	{
		System.out.println(n + " " + "is not a prime number");
	}
	}

}
