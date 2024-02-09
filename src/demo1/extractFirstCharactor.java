package demo1;

public class extractFirstCharactor {

	public static void main(String[] args) {
		// Print first char of string 
		String name="Mahendra singh Dhoni";
		String text[]=name.split(" ");
		int n=text.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<1;j++)
			{
				char ch=text[i].charAt(j);
				System.out.print(ch+".");
			}
		}
		System.out.print(text[n-1]);
		

	}

}
