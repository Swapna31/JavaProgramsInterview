package TestPkg1;
import java.nio.charset.Charset;
import java.util.HashMap;

public class OccurenceOfNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a[]= {10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
			HashMap<Character,Integer> map=new HashMap<>();
			for(int i=0; i<a.length; i++)
				{
				char[] chacr=String.valueOf(a[i]).toCharArray();
				for(int j=0;j<chacr.length;j++)
					{
						if(map.containsKey(chacr[j]))
							{
							map.put(chacr[j],map.get(chacr[j])+1);
							}
						else
						{
							map.put(chacr[j],1);
						}
					}
				//System.out.println(map);
				}
				
			System.out.println(map);
				}
			




	

}
