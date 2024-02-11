package NewOne;

import java.util.Map;
import java.util.TreeMap;

public class occuranceOfChar {

	public static void main(String[] args) {
		// Occurrence of char
		
		String s= "Automation Tester";
		s=s.toLowerCase();
		s=s.replace(" ", "");
		char[] ch=s.toCharArray();
		Map<Character, Integer>map=new TreeMap<>();
		int count =0;
		for(int i =0;i<s.length();i++)
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
