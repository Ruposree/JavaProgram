package generic;

public class ReplaceAnElement {

	public static String replacingAnElement(String str) {
		char[] ch=str.toCharArray();
		char c1='i';
		char c2='e';
		String str1="";

		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]==c1) {
				str1=str1+'e';
			}
			else if (ch[i]==c2) {
				str1=str1+"ex";
			}
			else
				str1=str1+ch[i];

		}
		return str1;

	}

	public static void main(String[] args) {
System.out.println(replacingAnElement("qspider"));

	}

}
