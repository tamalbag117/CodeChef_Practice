/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C30
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		  Scanner sc =new Scanner (System.in);
		  int T=sc.nextInt();
		  for (int i=0;i<T ;i++){
		   int A=sc.nextInt();
		   int B=sc.nextInt();
		   int max=A+B;
		   int min=0;
		   if(A>=B)min=A;
		   else min=B;
		   System.out.println(min+" "+max);
		  } 
		} catch(Exception e) {
		 return;} 
	}
}
