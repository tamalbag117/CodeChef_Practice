/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C36
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		 Scanner sc=new Scanner(System.in);
		 int T=sc.nextInt();
		 for (int i=0;i<T;i++ ) {
		     int N=sc.nextInt();
		     int t=N;
		     int sum=0;
		     while(N>0){
		      sum=sum*10+(N%10);
		      N=N/10;
		     }
		     if(t==sum)System.out.println("wins");
		     else System.out.println("loses");
		 }
		 sc.close();
		} catch(Exception e) {
		return;}
	}
}
