package NewOne;

public class fibonacciSeries {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13
		
		int a=0,b=1,c=0;
		System.out.print(a+" "+b);
		for(int i=0;i<10;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}

}
