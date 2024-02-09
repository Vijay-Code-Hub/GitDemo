package arrayCode;

public class maxOfArray {

	public static void main(String[] args) {
		// Find the maximum value in array
		int a[]= {1,9,3,4,2,1,8};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
