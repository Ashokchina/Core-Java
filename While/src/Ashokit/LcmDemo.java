package Ashokit;

import java.util.Scanner;

public class LcmDemo {
	private static void lcm(int n1,int n2) {
		int lcm;
		lcm=n1>n2?n1:n1;
		while(true) {
			if(lcm%n1==0&&lcm%n2==0) {
				System.out.println("lcm"+lcm);
				break;
			}
			lcm++;
		}
	}
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first num");
    int num1=sc.nextInt();
    System.out.println("enter second num");
    int num2=sc.nextInt();
    lcm(num1,num2);
	}

}
