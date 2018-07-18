import java.util.Scanner;

public class LengthOfString {
	
	public static void length(String str) {
		char[] ch=str.toCharArray();
		int k=0;
		for(int i=0;i<=ch.length-1;i++) {
			k++;
		}
		System.out.println(k);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		length(sc.nextLine());
		sc.close();

	
	}
	

}
