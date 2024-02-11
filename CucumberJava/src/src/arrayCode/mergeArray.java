package arrayCode;

public class mergeArray {

	public static void main(String[] args) {
		// Merge two array
		
		int a[]= {2,5,1,4,2};
		int len1=a.length;
		int b[]= {3,0,5,8,3};
		int len2=b.length;
		int len3=len1+len2;
		int c[]=new int[len3];
		for(int i=0;i<len1;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<len2;i++)
		{
			c[len1+i]=b[i];
		}
		for(int i=0;i<len3;i++)
		{
			System.out.print(" "+c[i]);
		}

	}

}
