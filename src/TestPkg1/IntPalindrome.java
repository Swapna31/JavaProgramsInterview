package TestPkg1;

public class IntPalindrome {

	public void palindrome(int number)
	{
		//int number=2002;
		char[] c= String.valueOf(number).toCharArray();
		try {
		for(int i=0;i<2;i++)
					{
			int len=c.length;
			if(c[i]!=c[len-1-i])
					{
				System.out.println("This is not a palindrome");
				
					}
									}
		System.out.println("This is a palindrome");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		}
	
	public static void main(String[] args) {
		IntPalindrome intp=new IntPalindrome();
		intp.palindrome(9009);

	}

}
