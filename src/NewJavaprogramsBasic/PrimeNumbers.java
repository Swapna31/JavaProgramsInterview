package NewJavaprogramsBasic;

public class PrimeNumbers {
//1,2,3,5,7,11,13,17(number should be divisible by 1 and itself)
	public static void main(String[] args) {
		int a= 29;
		int i=2;
		boolean flag=false;
		while(i<=a/2)
		{
		if(a%i==0)
		{
			flag=true;
			break;
		}
		++i;
		}
		if(!flag)
{
	System.out.println("This is a prime number");
}
		else
		{
			System.out.println("This is not a prime number");
		}
	}

}
