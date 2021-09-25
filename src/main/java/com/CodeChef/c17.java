/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class c17
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
			Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = a+b;
            int count=0;

            while (sum!=0)
            {
                int mod = sum%10;
                if(mod==0 || mod==9)
                    count+=6;
                else if(mod==1)
                    count+=2;
                else if(mod==2 || mod==3 || mod==5)
                    count+=5;
                else if(mod==4)
                    count+=4;
                else if(mod==6)
                    count+=6;
                else if(mod==7)
                    count+=3;
                else if(mod==8)
                    count+=7;

                sum/=10;
            }
            System.out.println(count);
        }
		sc.close();
		} catch(Exception e) {
		return ;}
	}
}
