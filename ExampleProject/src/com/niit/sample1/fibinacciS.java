package com.niit.sample1;

import java.util.Scanner;

public class fibinacciS {
	public void fib()
	{
		int n1=0,n2=1,n3;
		
		Scanner obj2=new Scanner(System.in);
		System.out.println("enter the count");
		int count= obj2.nextInt();
		System.out.println(n1+" ");
		System.out.println(n2);
		for (int i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
	}
}
