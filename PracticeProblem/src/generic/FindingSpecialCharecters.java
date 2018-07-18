package generic;

public class FindingSpecialCharecters {

	public static String findingSpecialCharecters(String str) {
		char[] ch=str.toCharArray();
	String str1="";
		for(int i=0;i<=ch.length-1;i++) {
			if(!(ch[i]>=48 && ch[i]<=57)&&(!(ch[i]>=65 && ch[i]<=90))&&(!(ch[i]>=97 && ch[i]<=122))) {
				str1=str1+ch[i];
			}
		}
		return str1;
	}

	public static void main(String[] args) {
		System.out.println(findingSpecialCharecters("qsp@id%*&#_125364!#$%er~"));

	}
}
