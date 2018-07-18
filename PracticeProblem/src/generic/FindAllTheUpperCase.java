package generic;

public class FindAllTheUpperCase {
	
	public static String findAllTheUpperCase(String str) {
		char[] ch=str.toCharArray();
	String upper="";
		for(int i=0;i<=ch.length-1;i++) {
			if((ch[i]>=65 && ch[i]<=90)) {
					
			upper=upper+ch[i];
			
			}
		
		}
		return upper;
	}

	public static void main(String[] args) {
		System.out.println(findAllTheUpperCase("QSPIderDER"));

	}

}
