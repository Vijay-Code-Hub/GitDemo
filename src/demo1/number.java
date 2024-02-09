package demo1;

public class number {

	public static void main(String[] args) {
		
		
		//Plaindrone number
		
		int no=121,rem,rev=0;
		int temp=no;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
		
		
		
	}

}
