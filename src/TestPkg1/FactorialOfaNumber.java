package TestPkg1;

public class FactorialOfaNumber {

	public void factorial(int n)
	{int fact=1;;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of given number is" + " " + fact);
	}
	public static void main(String[] args) {
		FactorialOfaNumber f=new FactorialOfaNumber();
		f.factorial(5);

	}

}
