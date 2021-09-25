/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C15
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int n = sc.nextInt();
		      int count = 0;
		    while(n!=0){
		        int a = (int)Math.sqrt(n);
		        n-=(a*a);
		        count++;
		    }
		 System.out.println(count);   
		}
		 sc.close();    
		} catch(Exception e) {
		return;}
	}
}
