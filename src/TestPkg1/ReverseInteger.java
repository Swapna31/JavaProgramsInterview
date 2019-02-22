package TestPkg1;

public class ReverseInteger {

	public static void main(String[] args) {
	int n=2003;
	char c[] = String.valueOf(n).toCharArray();
	for(int i=c.length-1;i>=0;i--)
		{int a=Character.getNumericValue(c[i]);
		System.out.println(a);
		
	}

	}

}
