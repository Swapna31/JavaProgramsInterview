package NewJavaprogramsBasic;

public class MedianOftwoArrays {

	public static void main(String[] args) {
	int[] a= {2,5,9};
	int[] b= {2,4};
	//Create new array with the size of a size+b size
	int[]c =new int[a.length+b.length];
	//Arraycopy(firstarray,initialindex(src),new array,0th index,number of elements-first array size)
	System.arraycopy(a,0,c,0,a.length);
	//ArrayCopy(second array,0th index ele,new array,2nd indexposition as already 1st copied,b length-number of elemnts to copy)
	System.arraycopy(b,0,c,a.length,b.length);
	int len=c.length;
	try {
	if (len%2==0)
	{//median of even aray is 
		System.out.println(c[(len/2)-1]);
	System.out.println(c[(len/2)]);
		int sum=c[(len/2)-1]+c[(len/2)];
		System.out.println(sum);
		
	}
	else if(len%2==1)
	{//median of odd integer array is
		System.out.println(c[(len/2)]);
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
