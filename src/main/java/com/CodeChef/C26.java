/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C26
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		    Scanner sc =new Scanner(System.in);
		    int T=sc.nextInt();
		    for (int i=0;i<T ;i++ ){
		    int N=sc.nextInt();
		    if(N<10)System.out.println("Thanks for helping Chef!");
		    else System.out.println("-1");
		    }
		    sc.close();
		    
		} catch(Exception e) {
	return;	} 
	}
}
