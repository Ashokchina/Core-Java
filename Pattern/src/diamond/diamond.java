package diamond;

import java.util.Scanner;

public class diamond {
	private static void printleftangle(int n) {
		for(int i=1;i<n;i++) {
			for(int j=(n-i);j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print("* ");
			}
			System.out.println( );
		}
	
	for(int i=1;i>=1;i--) {
		for(int j=(n-1);j>=1;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("* ");
		}
		System.out.println();
	}}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value");
		int nextInt = scan.nextInt();
		printleftangle(nextInt);

}
}