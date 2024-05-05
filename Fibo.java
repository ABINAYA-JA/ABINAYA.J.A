
import java.util.*;
public class Fibo{  
	public static void main(String args[])  
	{    
	 int a=0,b=1,c,i,fibo=10;    
	 System.out.print(a+" "+b);  
	 for(i=2;i<fibo;++i)
	 {    
	  c=a+b;    
	  System.out.print(" "+c);    
	  a=b;    
	  b=c;    
	 }    
	}
}
