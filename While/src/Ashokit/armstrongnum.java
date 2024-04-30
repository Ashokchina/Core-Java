package Ashokit;

import java.util.Scanner;

public class armstrongnum {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("please enter any number:");
    int number=scan.nextInt();
    
    boolean flag=armstrong(number);
    	if(flag=true){
    		System.out.println("it is an armstong number");
    		}
    	else {
    		System.out.println("it is not armstong number");
    	}
	}

	private static boolean armstrong(int n) {
		int temp=n,sum=0,d;
		String str=String.valueOf(n);
		int x=str.length();
		while(temp!=0) {
			d=temp%10;
			sum =sum+(int)Math.pow(d,x);
			temp=temp/10;
		}
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}

	}

}

