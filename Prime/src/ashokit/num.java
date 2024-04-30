package ashokit;

import java.util.Scanner;

public class num {

	private static boolean  prime( int n)
	{
		if(n==1)
		{
			return false;
		}
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0) 
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
public static void main(String[] args) {
	Scanner Scan=new Scanner(System.in);
	System.out.println("please in a number");
	int number=Scan.nextInt();
	boolean flag=  prime(number);
	if (flag==true)
	{
		System.out.println(number+"is prime number");
	}
	else
	{
		System.out.println(number+"is not prime number");
	}
}
	
}
	
