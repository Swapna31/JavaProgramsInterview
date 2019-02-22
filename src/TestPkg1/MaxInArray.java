package TestPkg1;

public class MaxInArray {

	public static void main(String[] args) {
		int a[] = {12,6,3,15,2,24};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			continue;
		}
System.out.println("max number of the array is " + max);
	}

}
