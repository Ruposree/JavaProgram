
public class ReverseaString {

	public static void main(String[] args) {
		String str="Good friend is really needed";
		String[] str1=str.split(" ");
		String str2="";
		String fswipe = str1[0];
		String midswipe=str1[str1.length/2];
		String lastswipe=str1[str1.length-1];
		String temp;
		
			temp=fswipe;
			fswipe=lastswipe;
			lastswipe=midswipe;
			midswipe=temp;
			for(int i =0;i<str1.length;i++)
			{
				str2 = str2+str1[i];
			}
		System.out.println(str2);

	}
		
	
	
		
		
	}


