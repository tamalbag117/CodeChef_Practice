/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C43
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		 Scanner sc = new Scanner (System.in);
		 int T=sc.nextInt();
		 for(int j=0;j<T;j++){
		 String s = sc.next();
		 int a=0;
		 int b=0;
		 for (int i=0;i<s.length();i++) {
		 if(s.charAt(i)=='a')a++;
		 else if (s.charAt(i)=='b')b++; 
		 }
		 if(a>=b)System.out.println(b);
		 else System.out.println(a);
		 }
		 sc.close();
		} catch(Exception e) {
		return;} 
	}
}
