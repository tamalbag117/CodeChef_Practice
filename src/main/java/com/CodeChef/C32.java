/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C32
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		   Scanner sc=new Scanner(System.in);
		char s=sc.next().charAt(0);
		if(s=='A' || s=='E' || s=='I' || s=='O' || s=='U'){
		    System.out.println("Vowel");
		}
		else{
		    System.out.println("Consonant");
		}
		} catch(Exception e) {
		return;} 
	}
}
