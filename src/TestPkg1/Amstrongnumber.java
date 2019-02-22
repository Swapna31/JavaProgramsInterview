package TestPkg1;
//153=1(cube-1*1*1)+5(cube-5*5*5)+3(cube-3*3*3)
public class Amstrongnumber {

	//int number=153;
	public void Armstrongnumber()
	{int number=153;
	int sum=0;
	try {
	for(int i=0;i<3;i++)
	{
		
		char c=String.valueOf(number).charAt(i);
		int num=Character.getNumericValue(c);
		//System.out.println(num);
		double power=Math.pow(num,3);
		sum=(int) (sum+power);
		}//System.out.println(sum);
		if(sum==number)
		{
			System.out.println("this is armstrong number");
		}
		else
			System.out.println("This is not armstrong number");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	
	public static void main(String[] args) {
		Amstrongnumber Amstrongnumber_ref=new Amstrongnumber();
		Amstrongnumber_ref.Armstrongnumber();

	}

}
