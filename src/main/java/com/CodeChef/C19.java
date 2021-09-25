/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C19
{
    public static long gcd(long a,long b){
        if (a==0){
            return b;
        }
        else
        return gcd(b%a,a);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		    Scanner sc =new Scanner(System.in);
		    int T=sc.nextInt();
		    for (int i=0;i<T ;i++ ) {
		        long a=sc.nextInt();
		        long b=sc.nextInt();
		        long g=gcd(a,b);
		        long l=(a*b)/g;
		         System.out.println(g+" "+l);
		    }
		    sc.close();
		    
		} catch(Exception e) {
	    return;	} 
		
	}
}
