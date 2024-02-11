package demo1;

public class removeVowels {

	public static void main(String[] args) {
		
		
		String str= "Vijay" , str1="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(!(ch==('a'|'A')|(ch==('e'|'E')|(ch==('i'|'I')|(ch==('o'|'O')|(ch==('u'|'U')))))))
					{
				str1=str1+ch;
				
					}
		}
		System.out.println(str1);
		
		
	}

}
