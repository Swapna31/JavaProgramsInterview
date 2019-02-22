package TestPkg1;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class DuplicateElementsinArray {
	int[] a= {10,11,12,12,13,14,15,15};
HashMap<Integer,Integer>m=new HashMap<>();
List<Integer> l=new ArrayList<>();
	public void duplicateElements()
	{int[] a= {0,1,2,3,4,5,6,7,8,1,2,3};
		for(int i=0;i<a.length;i++)
		{
			if(!(m.containsKey(a[i])))
								{
				m.put(a[i],1);
			}
			else
			{
				m.put(a[i],(m.get(a[i])+1));
			}
						}
		System.out.println("print the map elements " + m );
	Set<Integer> s=	m.keySet();
	List<Integer> l=new ArrayList<>();
	for(int i:s)
	{
		if(m.get(i)>1)
		{
			l.add(i);
		}			
	}
	System.out.println("print the duplicate values" +l);
	}
	
	public static void main(String[] args) {
		//int[] a= {10,11,12,12,13,14,15,15};
		DuplicateElementsinArray obj=new DuplicateElementsinArray();
		obj.duplicateElements();

	}

}
