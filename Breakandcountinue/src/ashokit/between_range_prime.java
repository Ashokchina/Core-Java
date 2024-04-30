package ashokit;

import java.util.Scanner;

public class between_range_prime {

	public static void main(String[] args) {

		int cnt,  x,y;
		
		for(int i=1;i<=5;i++) {
		cnt=0;
		for(int j=2;j<=i/2;j++) {
			if(j%i==0) {
				cnt++;
				break;
			}
		}
		if(cnt==0) {
			
			System.out.println(i);
		}
	}
		
	}}

