/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C23
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		  Scanner sc =new Scanner(System.in);
		  int N=sc.nextInt();
		  if(N%4==0)
		      N++;
		  else N--;
		  System.out.println(N);
		} catch(Exception e) {
	 return;	} 
		
	}
}
