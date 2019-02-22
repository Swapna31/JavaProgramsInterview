package TestPkg1;

public class ReverseString {

	public static void main(String[] args) {
		String city="Hyderabad";
		String rev="";
		try {
		for(int i=city.length()-1;i>=0;i--)
		{
			rev=rev+city.charAt(i);
		}
		
System.out.println(rev);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}