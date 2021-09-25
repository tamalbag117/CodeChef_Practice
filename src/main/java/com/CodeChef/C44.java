/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C44
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		 Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    String s=String.valueOf(x);
	    int count =s.length();
	    if(count==1) System.out.println(1);
	    else if(count==2) System.out.println(2);
	    else if(count==3) System.out.println(3);
	    else if(count>3) System.out.println( "More than 3 digits");  
	    sc.close();
		} catch(Exception e) {
		    return;
		}
	}
}
