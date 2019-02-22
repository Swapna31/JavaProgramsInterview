package NewJavaprogramsBasic;

public class SumOfIndicestarget {
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//	Given nums = [2, 7, 11, 15], target = 9,//
	//Because nums[0] + nums[1] = 2 + 7 = 9,
	//return [0, 1].
	
	public void SumOfIndices()
	{
		int a[]= {2,6,7,15};
		int target=9;
		int i=0;
		while(i<1)
		{
			for(int j=1;j<4;j++)
			{
				if((a[i]+a[j])==target)
				{
					System.out.println("Indices are" +" " + i + " " +j);
				}
			}
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		SumOfIndicestarget soi=new SumOfIndicestarget();
		soi.SumOfIndices();

	}

}
