package practice02_string;

import java.util.Scanner;

public class ConvertingLowercaseToUppercase {
	static Scanner sc=new Scanner(System.in);
	
	public static String convertingLowerToUpper(String str) {
		String upper="";
		char ch[]=str.toCharArray();
		for(int i=0;i<=ch.length-1;) {
			if(ch[i]>=65 && ch[i]<=90) {
				char val =(char)(ch[i]-32);
				upper=upper+val;
			}
			else {
				upper=upper+ch[i];
			}
		}
		return upper;
	}

	public static void main(String[] args) {
		System.out.println("enter the word");
		String str=sc.nextLine();
		String s=convertingLowerToUpper(str);
		System.out.println(s);
		

	}

}
