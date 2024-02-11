package numbers;

public class DemoNumbers {

	public static void main(String[] args) {
		int num=24,temp=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				temp=temp+1;
		}
		if(temp>2)
		{System.out.println(num+" is not prime number");}
		else
		{System.out.println(num+ " is prime number");}
		
	}

}
