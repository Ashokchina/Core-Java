package com.PrintStream;

import java.io.PrintStream;

public class PrintStreamOnConsole {

	public static void main(String[] args) {
	
		PrintStream ps = new PrintStream(System.out);
		String fLine = "EID\tENAME\tESALARY";
		ps.println(fLine);
		int[] id= {101,102,103,104,105};
		String[] name = {"JOHN","LUCY","TYSON","ROMEO","LILY"};
		double []salary= {10000.00,8000.00,9000.00,9500.00,8500.00};

		for(int i=0;i<id.length;i++) {
			ps.println(id[i]+"\t"+name[i]+"\t"+salary[i]);
		}
	
	}

}