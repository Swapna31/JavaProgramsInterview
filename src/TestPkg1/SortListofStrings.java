package TestPkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListofStrings {

	public static void main(String[] args) {
		List<String> l= new ArrayList<>();
		l.add("NewJersey");
		l.add("Washington");
		l.add("Boston");
		l.add("Maryland");
		System.out.println("before sorting the list is" +l);
		//Sorting on the list
		Collections.sort(l);
		System.out.println("After sorting the list" +l);
		//contains() function will check whether the given string is present in the list.
		System.out.println(l.contains("Boston"));
		

	}

}
