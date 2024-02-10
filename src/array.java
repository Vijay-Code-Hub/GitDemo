
public class array {

	public static void main(String[] args) {
		// Find second max value in array
		int a[]= {3,5,8,2,7};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[1]);

		

		


	}

}
