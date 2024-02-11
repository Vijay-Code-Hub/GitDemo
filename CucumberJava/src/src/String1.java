
public class String1 {

	public static void main(String[] args) {
		// string is declaring by literals way
		
		String s1= "My name is vijay ";
		String s2= "I have done cdac";
		
		//by creating object
		
		String s3= new String("My name is vijay");
		String s4=new String("I have done cdac");
		
		//split method 
		String[] splitString= s4.split(" ");
		System.out.println(splitString[1]);
//Iterate string 
		/*
		for(int i=0;i<s4.length();i++)
		{
			System.out.println(s4.charAt(i));
			
		}
		*/
		//reverse iterate
		for(int i=s4.length()-1;i>=0;i--)
		{
			System.out.println(s4.charAt(i));
		}
	}

}
