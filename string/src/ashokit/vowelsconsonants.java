package ashokit;

import java.util.Scanner;

public class vowelsconsonants {
private static void countvowelsandconsonants(String str) {
	int vowelcount=0,consonantscount=0;
	str=str.toLowerCase();
	char[]ch=str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
			vowelcount++;
		}
		else if(!Character.isDigit(ch[i])) {
			consonantscount++;
		}
	}
	System.out.println("vowels count:"+vowelcount);
	System.out.println("consonants count:"+consonantscount);
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a string");
		String str=scan.next();
countvowelsandconsonants(str);
	}

}
