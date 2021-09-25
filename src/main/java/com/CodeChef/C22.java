/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C22
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		 Scanner sc =new Scanner(System.in);
		 int T=sc.nextInt();
		 for (int i=0;i<T ;i++ ) {
		     int a=sc.nextInt();
		     int b=sc.nextInt();
		     if(a==b)System.out.println("=");
		     else if(a>b)System.out.println(">");
		     else System.out.println("<");
		 }
		 sc.close();
		} catch(Exception e) {
	 return;	} 
	}
}
