package ashokit;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value");
		int n= scan.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
	}
System.out.println(n+"factiorial="+fact);
	}
    }