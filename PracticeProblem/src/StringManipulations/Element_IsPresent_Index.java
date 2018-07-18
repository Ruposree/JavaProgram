package StringManipulations;

import java.util.Scanner;

public class Element_IsPresent_Index {

	static Scanner sc=new Scanner(System.in);

	public static int Find_Element_Index(String str, char element) {
		int r=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]==element) {
				r=i;
			
			}
			
		}


		return r;
	}
	
	
	public static int countOccurence(String str, char element){
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]==element) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter the word");
		String str=sc.nextLine();
		System.out.println("Enter the charecter");
		char element=sc.next().charAt(0);
		int r=Find_Element_Index(str,element);
		if(r>-1) {
			System.out.println("Element is present at index no "+r);
		}
		else {
			System.out.println("Element is not present and the index no is "+r);
		}
	
		int count=countOccurence(str,element);
		System.out.println("No of occurence is "+count);

	}

}
