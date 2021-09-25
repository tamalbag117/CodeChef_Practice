/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C48
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		 Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    if(X<=Y){
		        System.out.println(0);
		    }
		    else if(X>Y){
		        System.out.println(X-Y);
		    }
		}
		sc.close();
		} catch(Exception e) {
		  return;} 
	}
}
