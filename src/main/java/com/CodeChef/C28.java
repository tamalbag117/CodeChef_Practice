/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C28
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    Scanner sc=new Scanner(System.in);
		   double x=sc.nextDouble();
		   double y=sc.nextDouble();
		    if(x%5!=0 || x+0.5>y)
		        System.out.println(y);
		    else
		        System.out.println(y-x-0.5);
		    }
		catch(Exception e){
		    return;
		}
	}
}
