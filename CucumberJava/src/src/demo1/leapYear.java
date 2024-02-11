package demo1;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int LY=2004;
      if((LY%400==0)||( LY%4==0 && LY% 100!=0))
      {
    	 System.out.println("leap year"); 
      }else
      {
    	  System.out.println("not a leap year");
      }
	}

}
