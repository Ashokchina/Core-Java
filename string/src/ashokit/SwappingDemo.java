package ashokit;

import java.util.Scanner;

public class SwappingDemo {
private static void SwapDemo(String s1,String s2) {
	System.out.println("The String before Swapping....");
	System.out.println("first String"+s1);
	System.out.println("second String"+s2);
	s1=s1+s2;
	s2=s1.substring(0,s1.length()-s2.length());
	s1=s1.substring(s2.length());
	System.out.println("The String after Swapping....");
	System.out.println("first String"+s1);
	System.out.println("second String"+s2);
}
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first String");
		String str1=scan.nextLine();
		System.out.println("Enter second String");
		String str2=scan.nextLine();
		SwapDemo(str1,str2);
	}

}
