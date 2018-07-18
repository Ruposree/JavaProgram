package generic;

public class ReverseaString {
public static String reverseAString(String str) {
	char[] ch=str.toCharArray();
	String str1="";
	for(int i=ch.length-1;i>=0;i--) {
		str1=str1+ch[i];
		
	}
	return str1;
	
}
	public static void main(String[] args) {
		System.out.println(reverseAString("Qspider"));

	}

}
