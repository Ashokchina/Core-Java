package com.ashokit;

import java.util.Scanner;

public class Electricalbill {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				System.out.println("Enter bill units");
		int unit=(scan.nextInt());
		double amount=0;
		if(unit <=100) {
			amount=unit*3.75;
		}
		else if(unit<=300) {
			amount=unit*5.65;
		}
		else
		{
			amount=unit*7.78;
		}
		System.out.println("Bill amount;"+amount);
	}

}
