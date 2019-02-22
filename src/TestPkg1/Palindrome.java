package TestPkg1;

public class Palindrome {

	public void palindrome(String str1)
	{
	
	int len=str1.length();
	try
	{
	for(int i=0;i<(len-2);i++)
	{
		if(str1.charAt(i)!=str1.charAt((len-1)-i))
	{
		System.out.println("false");
			
		}
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		System.out.println("true");
	}

	public static void main(String[] args) {
		Palindrome p1=new Palindrome();
		p1.palindrome("madam");

	}

}
