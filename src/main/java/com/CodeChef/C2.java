package com.CodeChef;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
 public class C2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for (int i = 0; i < T; i++) {
       int N=sc.nextInt();
       int last =N%10;
       while (N>=10) {
        N=N/10;   
       }  
       int first=N; 
       int sum=first+last;
       System.out.println(sum); 
       }
       sc.close();  
      } catch (Exception e) {
          return;
      }  
		
	}
}
