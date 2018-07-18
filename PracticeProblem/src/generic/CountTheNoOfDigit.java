package generic;

import java.util.LinkedList;

public class CountTheNoOfDigit {

	public static int countTheNo(String str) {
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]>=48 && ch[i]>=57) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countTheNo("qspider"));

	}
	
	

}
