package TestPkg1;
//Reverse a string 
//convert string to a char array
//then loop thru back of the string
//append to a string builder

import java.util.Arrays;

public class ReverseAString {

	public static void main(String[] args) {
		StringBuilder t=new StringBuilder();
		String name="Nirmal gud";
		char[] array1=String.valueOf(name).toCharArray();
		//char[] array2=new char[name.length()];
for(int i=array1.length-1;i>=0;i--)
{
	 
	   t.append(array1[i]);
	}
System.out.println(t);
}
}