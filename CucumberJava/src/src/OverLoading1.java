
public class OverLoading1 {

	public static void main(String[] args) {
		
		OverLoading1 o1 = new OverLoading1();
		o1.eat("boss");

	
	
	
	}
	void eat(int a)
	{
		System.out.println("I am 1st");
	}
	void eat(String b)
	{
		System.out.println("I am 2nd");
	}

}

