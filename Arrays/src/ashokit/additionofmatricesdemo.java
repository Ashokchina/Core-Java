package ashokit;

import java.util.Scanner;

public class additionofmatricesdemo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int m=scan.nextInt();
int[][]matrix1=new int[n][m];
int[][]matrix2=new int[n][m];
System.out.println("please enter elements");
	for(int i=0;i<matrix1.length;i++) {
	for( int j=0;j<matrix1[i].length;j++)
		matrix1[i][j]=scan.nextInt();
	}
	{
for(int i=0;i<matrix2.length;i++) {
	for( int j=0;j<matrix2[i].length;j++)
		matrix2[i][j]=scan.nextInt();
}}
	additionofmatrices(matrix1,matrix2);
