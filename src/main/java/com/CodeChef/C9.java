/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C9
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=1&&n<=50) System.out.println("100");
		else if(n>50&&n<=100) System.out.println("50");
		else  System.out.println("0");
		sc.close();
		}catch(Exception e){return;}
	}
}
