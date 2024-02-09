package demo1;

public class reverseEachwords {

	public static void main(String[] args) {
		// reverse a words of string 
		String s= "My Name is Vijay";//
		String a[]=s.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}

	}

}
