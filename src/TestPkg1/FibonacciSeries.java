package TestPkg1;

public class FibonacciSeries {

	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13,21,34
		
		int firstnumber=0;
		int secondnumber=1;
		System.out.println(firstnumber);
		System.out.println(secondnumber);
		for(int i=0;i<10;i++)
		{
			int thirdnumber=firstnumber+secondnumber;
			System.out.println(thirdnumber);
			firstnumber=secondnumber;
			secondnumber=thirdnumber;
		}

	}

}
