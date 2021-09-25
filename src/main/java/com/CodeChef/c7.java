package com.CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;
public class c7{
    public static void main (String[] args)throws IOException {
        /* code */
try {
     Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A=sc.nextInt();
            int B=sc.nextInt();
            System.out.println(A%B);
        }
        sc.close();
} catch(Exception e) {
    return;
} 
    }
}