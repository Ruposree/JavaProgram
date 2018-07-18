package practice02_string;

import java.util.Scanner;

public class lengthofString {
	static Scanner sc=new Scanner(System.in);
	
	public static int lengthofString(char arr[]) {
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter the word");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int r=lengthofString(ch);
		System.out.println(r);

	}

}
