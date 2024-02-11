package NewOne;

public class removeDuplivateChar {

	public static void main(String[] args) {
		// Remove Duplicate char
		
		String s= "hello",res="";
		for(int i=0; i<s.length();i++)
		{
			String ch=""+s.charAt(i);
			
			
				if(res.contains(ch))
				{
					System.out.println("Duplicate character are :"+ch);
					continue;
				}
				res=res+ch;
			
		}
		System.out.println(res);

	}

}
