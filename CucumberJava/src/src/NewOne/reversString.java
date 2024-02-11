package NewOne;

public class reversString {

	public static void main(String[] args) {
		// Reverse a string 
		
		String s = "Hello" ,rev="";
		for(int i=s.length()-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);

	}

}
