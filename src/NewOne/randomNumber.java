package NewOne;

import java.util.Random;


public class randomNumber {

	public static void main(String[] args) {
		// Ganrate 10 digit random number

		long number;
		Random random=new Random();
		
		for(int i=0;i<2;i++)
		{
			number=random.nextLong(999999999);
			System.out.println(number);
		}
		
	}

}
