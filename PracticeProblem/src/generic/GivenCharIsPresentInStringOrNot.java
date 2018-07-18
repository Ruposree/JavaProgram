package generic;

public class GivenCharIsPresentInStringOrNot {

	public static boolean verifyingCharIsPresentOrNot(String str,char c) {
		char[] ch=str.toCharArray();

		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]==c)
			{
				return true;
				
			}


		}
		return false;

	}

	public static void main(String[] args) {

		System.out.println(verifyingCharIsPresentOrNot("qspider",'i'));
	}

}
