/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C34
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 try {
      Scanner sc=new Scanner(System.in);
      int T=sc.nextInt();
     ArrayList<Integer>N=new ArrayList<>(T);
     for (int i = 0; i < T; i++) {
      N.add(i, sc.nextInt()); 
     } 
     int c1=0,c2=0;
     for (int i = 0; i <N.size(); i++) {
       if(N.get(i)%2==0)c1++;
       else c2++;
     }
     if(c1>c2)System.out.println("READY FOR BATTLE");
     else System.out.println("NOT READY");
    sc.close();
    } catch (Exception e) {
      return;
    }
	}
}
