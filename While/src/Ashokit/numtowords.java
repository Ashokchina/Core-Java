package Ashokit;

public class numtowords {
private static void num(int n) {
	int d=0;
	String words="";
	while (n!=0) {
		d=n%10;
		switch(d) 
		{
		case0:"zero"+words;
		      break;
		case1:"one"+words;
		    break;
		case2:"two"+words;
		    break;
		case3:"three"+words;
		    break;
		case4:"four"+words;
		    break;
		case5:"five"+words;
		    break;
		case6:"six"+words;
		    break;
		case7:"seveen"+words;
		    break;
		case8:"eight"+words;
		    break;
		case9:"nine"+words;
		    break;
		}
		n=n%10;
	}
	System.out.println(words);
}
	
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("please enter a number");
	}
}
