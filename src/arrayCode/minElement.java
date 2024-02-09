package arrayCode;

public class minElement {

	public static void main(String[] args) {
		int arr[]= {9,3,5,1,7,3};
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
		
		

	}

}
