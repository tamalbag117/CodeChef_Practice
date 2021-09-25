/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C46
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		Scanner sc = new Scanner (System.in);
		int T=sc.nextInt();
		while(T-->0){
		    String s= sc.next();
		    int c1=0,c2=0;
		    for (int i=0;i<s.length() ;i++ ) {
		        if(s.charAt(i)=='1')c1++;
		        if(s.charAt(i)=='0')c2++;
		    }
		    if(c1==1||c2==1)System.out.println("Yes");
		    else System.out.println("No");
		}
		} catch(Exception e) {
		    return;
		}
	}
}
