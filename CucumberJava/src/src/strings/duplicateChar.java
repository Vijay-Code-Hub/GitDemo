package strings;

public class duplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Automation";
		//String strNew = str.replaceAll("([A-Z])");
		//System.out.println(strNew);
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.println("duplicate charectore are :" + ch[j]);
					
				}
				
			}
		}
	}

}
