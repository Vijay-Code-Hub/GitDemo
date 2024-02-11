package strings;

//program for reverse a string 
public class reverseString {

	public static void main(String[] args) {
		String str="vijay",rev="";
		
		
		int lenth=str.length();
		for(int i=lenth-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

	

}
