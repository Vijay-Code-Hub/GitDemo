
public class CoreJava2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,44,66,77,88};
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]%2==0)
			{
			System.out.println(arr[i]);
			}
			else System.out.println(arr[i]+ " this is not multip;e of two");
			}

	}

}
