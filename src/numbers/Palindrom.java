package numbers;

public class Palindrom {

	public static void main(String[] args) {
		
		int num=121,rem,rev=0;
		int org_num=num;
	while(num!=0)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
	}
	if(org_num==rev)
	{
	System.out.println("Palindrom");
	}
	else
	{
		System.out.println("not Palindrom");
	}
	}
	

}
