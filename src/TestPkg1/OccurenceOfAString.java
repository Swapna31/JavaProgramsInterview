package TestPkg1;

public class OccurenceOfAString {

	//String s="shello123hello456hello728";
	//String pattern="hello";
	int lastindex=0;
	int count=0;
		
	public void OccurenceofString(String s,String pattern)
	{
		while(lastindex!=-1)
		{
				
	lastindex=s.indexOf(pattern,lastindex);
	if(lastindex!=-1)
	{count++;
		lastindex=lastindex+pattern.length();
	}
		}
	System.out.println("the count is" +count);
	
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OccurenceOfAString o=new OccurenceOfAString();
		o.OccurenceofString("hello123 hello456 hello728 hello","hello");

	}

}
