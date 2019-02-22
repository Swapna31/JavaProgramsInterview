package TestPkg1;
//Reversing an Integer
//convert int number to char array
//loop thru array and convert the char value in int
public class ReverseAInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=34567;
		char[] array1=String.valueOf(number).toCharArray();
		for(int i=array1.length-1;i>=0;i--)
		{
			int a=Character.getNumericValue(array1[i]);
			System.out.print(a);
		}
	}

}
