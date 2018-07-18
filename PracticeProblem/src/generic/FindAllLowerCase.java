package generic;

public class FindAllLowerCase {

	public static String findAllTheLowerCase(String str) {
		char[] ch=str.toCharArray();
	String lower="";
		for(int i=0;i<=ch.length-1;i++) {
			if((ch[i]>=97 && ch[i]<=122)) {
					
			lower=lower+ch[i];
			
			}
		
		}
		return lower;
	}
	
	public static void main(String[] args) {
		System.out.println(findAllTheLowerCase("qspiDERder"));

	}

}
