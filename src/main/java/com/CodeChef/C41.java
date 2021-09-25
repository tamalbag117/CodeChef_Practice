/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C41
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
          Scanner sc =new Scanner(System.in);
          int T=sc.nextInt();
          ArrayList<Integer>sum=new ArrayList<Integer>(T);
          ArrayList<Integer>s=new ArrayList<Integer>(T);
          for (int i = 0; i < T; i++) {
          int s1=sc.nextInt();
          int s2=sc.nextInt();
          sum.add(i,(s1-s2));
          s.add(i,(int)Math.abs(sum.get(i)));
          }
          //ArrayList shorting
          int max = s.get(0);
          int index = 0;
          for (int i = 0; i <T; i++) 
          {
            if (max < s.get(i)) 
            {
              max = s.get(i);
              index = i;
            }
          }
          if (sum.get(index)>=0) {
              System.out.println("1 "+s.get(index));
          } else {
              System.out.println("2 "+s.get(index));
          }
          sc.close();
      } catch (Exception e) {
          return;
      }  
	}
}
