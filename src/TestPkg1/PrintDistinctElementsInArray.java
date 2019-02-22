package TestPkg1;

public class PrintDistinctElementsInArray {

	public static void main(String[] args) {
		int[] a= {10,20,10,5,6,6,4};
		
		for(int i=0;i<a.length;i++)
		{boolean IsDistinct=false;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					IsDistinct=true;
				break;
				}
			}
			if(!IsDistinct)
			{
			System.out.println(a[i]+",");
		}

	}

}
}
