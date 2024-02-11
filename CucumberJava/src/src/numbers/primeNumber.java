package numbers;

public class primeNumber {

	public static void main(String[] args) {
		int num=7,temp=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>2)
		{
			System.out.println("numer is not prime number");
		}
		else
		System.out.println("prime number");
		

	}

}
