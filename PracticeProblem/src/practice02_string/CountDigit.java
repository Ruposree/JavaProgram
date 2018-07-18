package practice02_string;

import java.util.Scanner;

public class CountDigit {
	static Scanner sc=new Scanner(System.in);
	
	public static int countDigits(String str) {
		char [] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]>=48 && ch[i]<=57) {
				count++;
			}
		}
		
		return count;
	}
	
	public static int[] printingdigit(String str, int count) {
		int arr[]=new int[count];
		int j=0;
		char [] ch=str.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]>=48 && ch[i]<=57) {
				arr[j++]=ch[i];
			}
		}		
		return arr;
	}

	public static void main(String[] args) {
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int count=countDigits(str);
		System.out.println(count);
		int [] digit=printingdigit(str,count);
		for(int d:digit) {
			System.out.println(d);
		}

	}

}
