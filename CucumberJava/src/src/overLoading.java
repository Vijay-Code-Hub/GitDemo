
public class overLoading {

	public static void main(String[] args) {
		overLoading a = new overLoading();
		
		a.show("vij");
		
		
	}
	void show(int b)
	{
		System.out.println("Method 1");
	}
	void show(String c )
	{
		System.out.println("Method 2");
	}
	

}
