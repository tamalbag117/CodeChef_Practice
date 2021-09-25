/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C47
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		 Scanner sc = new Scanner(System.in);
		 int T=sc.nextInt();
		 while(T-->0){
		  int p =sc.nextInt();
		  int sum=0;
		  while(p-->0){
		      int s=sc.nextInt();
		      sum+=s;
		  }
		  if(sum%2!=0)System.out.println("YES");
		  else System.out.println("NO");
		 }
		} catch(Exception e) {
		    return;
		}
	}
}
