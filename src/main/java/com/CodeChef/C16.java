/* package codechef; // don't place package name! */
package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class C16
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner obj=new Scanner(System.in);
		    String r=obj.next();
		    int n=obj.nextInt();
		    String a[]=new String[n];
		    for(int i=0;i<n;i++){
		        a[i]=obj.next();
		    }
		    ArrayList<Character> arr=new ArrayList<>();
		    char c[]=r.toCharArray();
		    for(int i=0;i<c.length;i++){
		        arr.add(c[i]);
		    }
		    for(int i=0;i<n;i++){
		        int f=0;
		        char d[]=a[i].toCharArray();
		        for(int j=0;j<d.length;j++){
		            if(arr.contains(d[j])){
		                continue;
		            }
		            else{
		                f=1;
		                break;
		            }
		        }
		        if(f==1){
		            System.out.println("No");
		        }
		        else{
		           System.out.println("Yes");
		        }
		    }
		    
		}
		catch(Exception e){return;}
	}
}
