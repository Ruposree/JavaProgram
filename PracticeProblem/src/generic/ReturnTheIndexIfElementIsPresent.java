package generic;

public class ReturnTheIndexIfElementIsPresent {

	public static int verifyingCharIsPresentOrNot(String str,char c) {
		char[] ch=str.toCharArray();

		int index=-1;

		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]==c) {
			index=i;
			}
			
			
		}
		return index;

	}

	public static void main(String[] args) {
		
		int val=verifyingCharIsPresentOrNot("qspider",'l');
		if(val>-1) {
			System.out.println("Element is present");
		}
		else {
			System.out.println("element is not present");
		}
	}

}
