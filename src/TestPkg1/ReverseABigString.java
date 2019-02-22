package TestPkg1;

import java.nio.charset.Charset;
import java.util.List;

public class ReverseABigString {

	public static void main(String[] args) {
		String statement1="This is String";
		String[] str1=statement1.split(" ");
		for(String s:str1)
		{
			//System.out.println(s);
			
			String rev="";
			for(int i=(s.length())-1;i>=0;i--)
			{
				rev=rev+s.charAt(i);
				}
			String reverse=rev.concat(" ");
			System.out.print(reverse);
			{
				
			}
			
		}
	}
	}


