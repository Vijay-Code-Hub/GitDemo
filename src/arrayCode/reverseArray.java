package arrayCode;

public class reverseArray {

	public static void main(String[] args) {
		int arr[]= {9,8,6,5,4};
		int len=arr.length;
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}

}
