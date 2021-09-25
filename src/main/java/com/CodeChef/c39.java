/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
 public class c39
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		 Scanner sc =new Scanner(System.in);
		 int T=sc.nextInt();
		 for (int j=0;j<T ;j++ ) {
		     int c=0;
		     int N=sc.nextInt();
		     for(int i=2;i<N/2;i++){
		     if(N%i==0) {
		         c=1;
		         break;
		     }  
		     }
		     if(N==1||N==0)System.out.println("no");
		     else {
		         if (c==0) System.out.println("yes");
		         else System.out.println("no");
		     }
		 }
		 sc.close();
		} catch(Exception e) {
		return;}
	}
}
