package strings;

public class ExtractFirstChar {

	public static void main(String[] args) {
		// Extract First Char of string
		String s= "Automation Tester For Web";
		String a[]=s.split(" ");
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<1;j++)
			{
				char ch=a[i].charAt(j);
				System.out.print(ch+".");
			}
		}
		System.out.println(a[n-1]);

	}

}
