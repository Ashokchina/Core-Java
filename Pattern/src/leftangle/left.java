package leftangle;

import java.util.Scanner;

public class left {

	private static void printleftangle(int n) {
		for(int i=1;i<n;i++) {
			for(int j=2*(n-i);j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print("* ");
			}
			System.out.println( );
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scan.nextInt();
		printleftangle(n);
	}

}
