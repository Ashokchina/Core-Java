package Ashokit;

import java.util.Scanner;

public class harshadnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("please enter a number");
		int num=sc.nextInt();
		int x=num,y,sum=0;
		while(x>0) {
			y=x%10;
			sum=sum+y;
			x=x/10;
		}
		if(num%sum==0)
			System.out.println(num+"is a harshad num");
		else
			System.out.println(num+"it is not a harshad num");

	}

}
