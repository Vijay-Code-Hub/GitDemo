package demo1;

public class primeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=8, temp=0;
          for(int i=2;i<n;i++)
          {
        	  if(n%i==0)
        	  {
        		  temp=temp+1;
        	  }
          }
          if(temp==0)
          {
        	  System.out.println("prime number");
          }else
          {
        	  System.out.println("not prime number");
          }
	}

}
