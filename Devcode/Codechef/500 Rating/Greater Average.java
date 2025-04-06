import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{  Scanner sc= new Scanner (System.in);
	   int T = sc.nextInt();
	    while( T--> 0){
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        int C = sc.nextInt();
	        
	        if ((A+B) / 2.0 > C ) {
	            System.out.println("YES");
	    } else{
              		      System.out.println("NO");
		      // your code goes here
               }
	}
	 sc.close();
}
}