package generic;

public class OccurenceOfGivenElement {
	
	public static int occurenceOfGivenChar(String str,char c) {
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]==c) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(occurenceOfGivenChar("Gabbaaar",'a'));

	}

}
