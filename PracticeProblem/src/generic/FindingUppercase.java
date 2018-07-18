package generic;

import java.util.Scanner;

public class FindingUppercase {
	
	
	public static String toUpperCase(String str1) {
		char[] ch=str1.toCharArray();
		String str2="";
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]>=65 && ch[i]<=90) {
				str2=str2+ch[i];
			}
			
		}
		return str2;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String str=sc.nextLine();
		System.out.println(toUpperCase(str));
		
		
		
		
	}

}
