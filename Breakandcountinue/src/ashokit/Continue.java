package ashokit;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
	int sum=0,count=1,x;
	Scanner scan =new Scanner(System.in);
    while(count<=5) {
    	System.out.println("please enter +ve number");
    	x=scan.nextInt();
    	if(x<0) {
    		continue;
    	}
    	sum=sum+x;
    	count++;
    	
    	}
    System.out.println("sum of the 5+ve number "+sum);
	}
}
