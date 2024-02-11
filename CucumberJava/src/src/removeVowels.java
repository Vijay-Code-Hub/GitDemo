
public class removeVowels {

	public static void main(String[] args) {
		// remove vowels
		String s="HI Hello",res="";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(!(c=='a'|c=='e'|c=='i'|c=='o'|c=='u'))
			{
				res=res+c;//hhll
			}
		}
		System.out.println(res);

	}

}
