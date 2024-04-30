package ashokit;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
static boolean isAnagrams(String str1,String str2) {
	if(str1.length()!=str2.length()) {
		return false;
	}
	char[]strArray1=str1.toCharArray();
	char[]strArray2=str2.toCharArray();
	Arrays.sort(strArray1);
	Arrays.sort(strArray2);
	String sortedstr1=new String(strArray1);
	String sortedstr2=new String(strArray2);
	
	if(sortedstr1.equals(sortedstr2))
		return true;
	else
		return false;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter String: ");
String str1=sc.nextLine();
System.out.println("Enter String: ");
String str2=sc.nextLine();
if(isAnagrams(str1,str2))
	System.out.println("Strings are anagrams");
else
	System.out.println("String are not anagrams");
	}

}
