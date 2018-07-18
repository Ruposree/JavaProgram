package generic;

import java.util.Scanner;

public class PalindromeNo {
	public static void palimdrome(String str) {
		String str1=str;
		String str2="";
		 for(int i=str.length()-1;i>=0;i--) {
			 str2=str2+str.charAt(i);
		
		 }
		
		 if(str1.equals(str2)) {
			 System.out.println("yes it is a palindrome no");
		 }
		 else {
			 System.out.println("no it is not a palindrome no");
		 }
	
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	//String str=sc.nextLine();
	palimdrome(sc.nextLine());

	}

}
