package generic;

public class ToLowerCase {
	
	public static String convertingToLowercase(String str) {
		char[] ch=str.toCharArray();
	String upper="";
		for(int i=0;i<=ch.length-1;i++) {
			if((ch[i]>=65 && ch[i]<=90)) {
				char val=(char)(ch[i]+32);
					upper=upper+val;	
			}
			else {
				upper=upper+ch[i];
			}
		
		}
		return upper;
	}


	public static void main(String[] args) {
		System.out.println(convertingToLowercase("QSPIDERabcd"));// 

	}

}
