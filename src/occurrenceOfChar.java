import java.util.Map;
import java.util.TreeMap;

public class occurrenceOfChar {

	public static void main(String[] args) {
		// occurrence of Char
		
		
		String s= "Automation";
		s=s.toLowerCase();
		char []ch=s.toCharArray();
		int count=0;
		Map<Character, Integer>map=new TreeMap<>();
		for(int i=0;i<s.length();i++)
		{
			count=0;
			for(int j=0;j<s.length();j++)
			{
				
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			map.put(ch[i], count);
		}
		System.out.println(map);

	}

}
