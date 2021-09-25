/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C27
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for (int i = 0; i < T; i++) {
         int N=sc.nextInt();
        int c1=N/100;
        int c2=(N%100)/50;
        int c3=((N%100)%50)/10;
        int c4=(((N%100)%50)%10)/5;
        int c5=((((N%100)%50)%10)%5)/2;
        int c6=(((((N%100)%50)%10)%5)%2)/1;
        System.out.println(c1+c2+c3+c4+c5+c6);   
       } 
      } catch (Exception e) {
        return;
      }
	}
}
