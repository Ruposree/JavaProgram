package StringManipulations;

import java.util.Scanner;

public class ElementIsPresent {
	
	static Scanner sc=new Scanner(System.in);
	
	public static boolean  givencharisPresent(String str,char element) {
		
		char[] ch = str.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			
			if(ch[i]==element) {
				return true;
				
			}
			
		}
		
		return false;
	}
	

	public static void main(String[] args) {
		System.out.println("Enter the word");
		String str=sc.nextLine();
		System.out.println("Enter the element you want to find");
		char element=sc.next().charAt(0);
		
		
		boolean b=givencharisPresent(str,element);
		System.out.println(b);
		
		
		

	}

}
