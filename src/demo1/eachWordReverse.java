package demo1;

public class eachWordReverse {

	public static void main(String[] args) {
		// Each word reverse in string 
		String s="My Name is Vijay";
		String words[]=s.split(" ");
		String res="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String resWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				resWord=resWord+word.charAt(j);
			}
			res=res+resWord+" ";
		}
		System.out.println(res);
		

	}

}
