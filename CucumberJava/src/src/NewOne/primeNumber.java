package NewOne;

public class primeNumber {

	public static void main(String[] args) {
		// prime number
		int n=11,temp=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a Prime number");
		}

	}

}
