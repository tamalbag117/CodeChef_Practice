/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C35
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for (int i = 0; i < T; i++) {
         int N=sc.nextInt();
         int count=0;
         int dig =2048;
            while(N>0){
                count+=N/dig;
                N=N%dig;
                dig=dig/2;
            }
            System.out.println(count);
       } 
       sc.close();
      } catch (Exception e) {
        return;
      }
	}
}
