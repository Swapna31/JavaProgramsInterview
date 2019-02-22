package TestPkg1;
//Print distinct elements
//loop thru array values
//store in a set

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PrintDistinctElements {

	public static void main(String[] args) {
		
int[] array1= {5,2,7,8,8,6,9,5};
Set<Integer> s= new HashSet<Integer>();
for (int i=0;i<array1.length;i++)
{
	Collections.addAll(s, array1[i]);
	}
System.out.println(s);
	}

}
