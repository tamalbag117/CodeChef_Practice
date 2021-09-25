/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C38
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
     Scanner sc =new Scanner (System.in);
     int T=sc.nextInt();
     for (int i = 0; i < T; i++) {
       double a=sc.nextDouble();
       double b=sc.nextDouble();
       double c=sc.nextDouble();
       if(a>50&&b<0.7&&c>5600)System.out.println("10");
       else if(a>50&&b<0.7&&c<=5600)System.out.println("9");
       else if(b<0.7&&c>5600&&a<=50)System.out.println("8");
       else if(a>50&&c>5600&&b>=0.5)System.out.println("7");
       else if(a<=50&&b>=0.7&&c>5600)System.out.println("6");
       else if(a<=50&&b<0.7&&c<=5600)System.out.println("6");
       else if(a>50&&b>=0.7&&c<=5600)System.out.println("6");
       else if(a<=50&&b>=0.7&&c<=5600)System.out.println("5");
     }
     sc.close();
    } catch (Exception e) {
      return;
    }
	}
}
