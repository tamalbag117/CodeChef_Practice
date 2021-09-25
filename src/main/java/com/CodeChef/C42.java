/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C42
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for (int i=0;i<T ;i++) {
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b+1;
            int count=0;
            while (count!=2)
            {
                count=0;
                for (int j=1;j<=sum;j++)
                {
                    if (sum%j==0)count++;
                }
                if(count!=2)
                    sum++;
                else
                    break;
            }
            System.out.println(sum-(a+b));   
		}
		} catch(Exception e) {
		    return;
		}
	}
}
