package numbers;

public class leapYear {

	public static void main(String[] args) {
		// leap year 2016,2000,2004
		int num=2017;
		if((num%400==0)||(num%100!=0 && num%4==0))
		{
			System.out.println("Leap Year");
		}else
		{
			System.out.println("Not a leap year");
		}

	}

}
