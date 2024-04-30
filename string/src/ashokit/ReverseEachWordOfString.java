package ashokit;

import java.util.Scanner;

public class ReverseEachWordOfString {
	static String reverseword(String inputstr) {
		String[]strarray=inputstr.split("");
		StringBuilder sb = new StringBuilder();
		for(String s:strarray) {
			if(!s.equals("")) {
				StringBuilder sb1=new StringBuilder(s);
				String rev=sb1.reverse().toString();
				sb.append(rev+" ");
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String:");
		String str = sc.nextLine();
		System.out.println("Input String: "+str);
		System.out.println("String with Reverse word :"+reverseword(str));

	}

}
