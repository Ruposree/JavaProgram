package StringManipulations;

import java.util.Scanner;

public class Replace_elementwith_element {
static Scanner sc=new Scanner(System.in);
public static char[] replace_Element_withElement(String str,char element1,char element2,char element3, char element4) {
	int temp=0;
	char ch[]=str.toCharArray();
	
	for(int i=0;i<=ch.length-1;i++) {
		if(ch[i]==element1) {
			ch[i]=element2;
		}
		else if(ch[i]==element3) {
			ch[i]=element4;
			
		}
	}
	
	
	return ch;
}
	public static void main(String[] args) {
		System.out.println("Enter the word");
		String str=sc.nextLine();
		System.out.println("Enter the first element you want to replace");
		char element1=sc.next().charAt(0);
		System.out.println("Enter the element you want to replace with");
		char element2=sc.next().charAt(0);
		System.out.println("Enter the second element you want to replace");
		char element3=sc.next().charAt(0);
		System.out.println("Enter the  element you want to replace with");
		char element4=sc.next().charAt(0);
		
		char [] ch=replace_Element_withElement(str,element1,element2,element3,element4);
		for(char c:ch) {
			System.out.print(c);
		}
		

	}

}
