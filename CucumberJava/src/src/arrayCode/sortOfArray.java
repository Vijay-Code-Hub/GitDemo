package arrayCode;

public class sortOfArray {

	public static void main(String[] args) {
		// sort of array
		int a[]= {5,4,7,2,9};
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
			System.out.print(a[i]);
			
		}//System.out.println(a[1]);
		

	}

}
