package numbers;

public class armstrongNumber {

	public static void main(String[] args) {
		// Check number is Armstrong or not ?
		
		int n=152;
		int n1=n;
		int len=0;
		while(n1!=0)
		{
			n1=n1/10;
			len=len+1;
			
		}
		int n2=n,rem;
		int arm=0;
		while(n2!=0)
		{
			rem=n2%10;
			int mul=1;
			for(int i=0;i<len;i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			n2=n2/10;
		}
		if(arm==n)
		{
			System.out.println("yes");
		}else
		{
			System.out.println("No");
		}
	}

}
