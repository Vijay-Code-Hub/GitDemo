package strings;

public class firstChar {

	public static void main(String[] args) {
		// print first character of string like Mahendra singh Dhoni o/p-m.s.dhoni
		String s="Mahendra singh dhoni";
		System.out.print(s.charAt(0)+".");
		int last=s.lastIndexOf(' ');
		
		for(int i=0;i<last;i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
			{
				System.out.print(s.charAt(i+1)+".");
			}
		}System.out.println(s.substring(last+1));
		
	}

}
