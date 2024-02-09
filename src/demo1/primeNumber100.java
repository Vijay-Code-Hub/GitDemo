package demo1;

public class primeNumber100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
		int tem=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				tem=tem+1;
			}
		}
		if(tem==0)
		{
			System.out.println("prime number "+i);
		}
		
	}
	}

}
