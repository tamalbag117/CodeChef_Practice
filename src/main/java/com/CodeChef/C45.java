/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C45
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		 Scanner sc = new Scanner(System.in);
		 int T =sc.nextInt();
		 for (int i=0;i<T ;i++ ){
		 double c =sc.nextDouble();
		 double ax =sc.nextDouble();
		 double ay =sc.nextDouble();
		 double bx =sc.nextDouble();
		 double by =sc.nextDouble();
		 double cx =sc.nextDouble();
		 double cy =sc.nextDouble();
		 double ab=Math.sqrt(Math.pow(ax-bx,2)+Math.pow(ay-by,2));
		 double ac=Math.sqrt(Math.pow(ax-cx,2)+Math.pow(ay-cy,2));
		 double cb=Math.sqrt(Math.pow(cx-bx,2)+Math.pow(cy-by,2)); 
		 if(ac<=c&& ab<=c && cb<=c){
                System.out.println("yes");
            }else if(ab<=c && ac<=c && cb>c){
                System.out.println("yes");
            }else if(cb<=c && ac<=c && ab>c){
                System.out.println("yes");
            }else if(cb<=c && ab<=c && ac>c){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
		 } 
		 sc.close();
		} catch(Exception e) {
		 return;} 
	}
}
