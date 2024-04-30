package ashoknayak;

import java.util.Scanner;

public class triangle {

	private static void printtriangle(int n)
	{

for(int i=1;i<=n;i++) 
{
	for(int j=1;j<i;j++) {
	
		System.out.print("* ");
	}}
System.out.print(" ");
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value");
	    int i=scan.nextInt();
				printtriangle(i);
	}
}
	
