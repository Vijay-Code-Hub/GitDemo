package demo1;

public class removeDuplicateCh {

	public static void main(String[] args) {
		
		String s = "Automation Testerr", res="";
		
		for(int i =0 ; i <s.length(); i++)
		{
			String ch=""+s.charAt(i);
			if(res.contains(ch))
			{
				System.out.println("Duplicate char are :"+ch);
				continue;
			}
			res=res+ch;
			
		}
		System.out.println(res);
		

	}

}
