package numbers;

public class factorial {

	public static void main(String[] args) {
		// 5*4*3*2*1
		int num = 5, fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
