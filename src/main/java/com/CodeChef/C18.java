/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
 public class C18
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		   Scanner sc=new Scanner(System.in) ;
		   int T=sc.nextInt();
		   for (int i=0;i<T ;i++ ) {
		       int a=sc.nextInt();
		       int b=sc.nextInt();
		       int c=sc.nextInt();
		       if((a+b+c)==180)System.out.println("YES");
		       else System.out.println("NO");
		   }
		   sc.nextInt();
		} catch(Exception e) {
	  return;	} 
	}
}
