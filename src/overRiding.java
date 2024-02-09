
public class overRiding extends Car {

	public static void main(String[] args) {
		Car c1= new Car();
		c1.show();
		overRiding o2= new overRiding();
		o2.show();

	}
	void show()
	{
		System.out.println("2");
	}

}

class Car
{
	void show()
	{
		System.out.println("1");
	}
	
}
