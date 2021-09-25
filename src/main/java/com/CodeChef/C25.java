/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C25
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 try {
       Scanner sc =new Scanner(System.in);
       int T=sc.nextInt();
       for (int i = 0; i < T; i++) {
        String a=sc.next();
        String b=sc.next();
        int flag=0;
        int count=0;
        for (int j = 0; j < a.length(); j++) {
            if(a.charAt(j)=='?'||b.charAt(j)=='?')
            count++;
            if(a.charAt(j)!=b.charAt(j))
            flag++;
        }
        System.out.println(flag +" " +(flag+count));
       }
       sc.close();  
      } catch (Exception e) {
        return;
      }  
	}
}
