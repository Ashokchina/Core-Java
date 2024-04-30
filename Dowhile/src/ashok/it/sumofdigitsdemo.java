package ashok.it;
import java.util.Scanner;
public class sumofdigitsdemo {
private static void sumofdigits(int n) {
	int sum=0,d;
	if(n>0&&n<9) {
		System.out.println("sum of digits="+n);
		return;
	}
	do {
		d=n%10;
		sum=sum+10;
		n=n/10;
	}
	while(n!=0);
	System.out.println("sum of digits="+sum);
}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("please enter a number");
int n=sc.nextInt();
  sumofdigits(n);
	}

}
