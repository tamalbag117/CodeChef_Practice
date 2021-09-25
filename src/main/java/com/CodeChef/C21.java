/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C21
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		 Scanner sc =new Scanner(System.in);
		 int T=sc.nextInt();
		 for (int i=0;i<T ;i++ ) {
		     char id=sc.next().charAt(0);
		      if (id == 'B' || id == 'b')
        {
            System.out.println("BattleShip");
        }
        else if (id == 'C' || id == 'c')
        {
            System.out.println("Cruiser");
        }
         else if (id == 'D' || id == 'd')
        {
            System.out.println("Destroyer");
        }
         else if (id == 'F' || id == 'f')
        {
            System.out.println("Frigate");
        }
		 }
		 sc.close();
		} catch(Exception e) {
		return;} 
	}
}
