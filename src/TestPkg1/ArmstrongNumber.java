package TestPkg1;

public class ArmstrongNumber {

	int r= 0;
	int c=0;
	int temp=0;
	
	public void IsArmstrongnumber(int n)
	{
		temp=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			c=c+(r*r*r);
				}
		if(c==temp)
		{
			System.out.println("given number is armstrong number");
		}
		else
		{
			System.out.println("given number is not an armstrong number");
		}
	}
	
	
	public static void main(String[] args) {
		ArmstrongNumber a=new ArmstrongNumber();
		a.IsArmstrongnumber(153);

	}
}
