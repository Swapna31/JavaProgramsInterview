package TestPkg1;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharInAString {

	String Name="Hyderabad";
	public void findDuplicateCharinAString(String str)
		{
				HashMap <Character,Integer> charmap=new HashMap();
		char[] namec=String.valueOf(Name).toCharArray();
		for(char ch:namec)
		{
			if(charmap.containsKey(ch))
			{
				charmap.put(ch, charmap.get((ch))+1);
			}
			else
			{
				charmap.put(ch,1);
			}
	}
	System.out.println(charmap);
	Set<Character> keys=charmap.keySet();
	
	for (Character ch:keys)
	{
		if(charmap.get(ch)>1)
		{
			System.out.println(ch+ " " +charmap.get(ch));
		}
	}
		}
	
public static void main(String[] args) {			
	DuplicateCharInAString dupchar=new DuplicateCharInAString();
	dupchar.findDuplicateCharinAString(dupchar.Name);
}
}
