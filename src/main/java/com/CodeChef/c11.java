/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class c11
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		 Scanner sc=new Scanner(System.in);
		 int T=sc.nextInt();
		 for (int i=0;i<T ;i++ ) {
		     int A=sc.nextInt();
		     int B=sc.nextInt();
		     int C=sc.nextInt();
		     if (A>B && A>C){
		     if (B>C) 
		     System.out.println(B);
		     else
		     System.out.println(C);
		 }
		  else if (B>C && B>A){
		     if (A>C) 
		     System.out.println(A);
		     else
		     System.out.println(C);
		 }
		  else if (C>B && C>A){
		     if (B>A) 
		     System.out.println(B);
		     else
		     System.out.println(A);
		 }
		 
		 }
		} catch(Exception e) {
	 return;	} 
		
	}
}
