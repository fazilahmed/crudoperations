package com.niit.sample;

import java.util.Scanner;

public class classSample {
	public void tables()
	{
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the mupltiple");
		int a = obj.nextInt();
		System.out.println("enter the limit");
		int b=obj.nextInt();
		for(int i=1;i<=b;i++)
		{
			int c= i*a;
			System.out.println(i+"*"+a+"="+c);
		}
	}
}
