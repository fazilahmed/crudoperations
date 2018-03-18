package mainpack;

import java.util.Scanner;

import com.niit.sample.classSample;
import com.niit.sample1.fibinacciS;

public class sample {
	public static void main(String args[])
	{
		int fac1=1;
		Scanner obj3 = new Scanner(System.in);
		System.out.println("ënter the number");
		int fac=obj3.nextInt();
		for(int k=1;k<=fac;k++)
		{
			fac1=fac1*k;
		}
		System.out.println("factorial="+fac1);
		classSample h1 = new classSample();
		h1.tables();
		fibinacciS h2 = new fibinacciS();
		h2.fib();
		
	}
	
	

}
