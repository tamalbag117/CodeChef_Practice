/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class c14
{
	public static void main (String[] args) throws java.lang.Exception
	{
			// your code goes here
		try {
		 Scanner sc =new Scanner(System.in);
		 int t=sc.nextInt();
		 for (int i=0;i<t ;i++ ){
		  int n=sc.nextInt();
		  int f=1;
		  for (int j=1;j<=n;j++ ) {
		      f=f*j;
		  }
		  System.out.println(f);
		 }
		 sc.close();
		} catch(Exception e) {
		 return ;} 
	}
	}

