package NewOne;

public class palindromNumber {

	public static void main(String[] args) {
		// 121,1221,1234321
		
		
		int n=1231,rem,rev=0;
		int temp=n;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not palindrom");
		}

	}

}
