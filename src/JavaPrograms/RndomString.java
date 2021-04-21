package JavaPrograms;

import java.util.Random;

public class RndomString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
	    String numbers = "0123456789";
	    String alphNumeric=upperAlphabet+lowerAlphabet+numbers;
	    String s="";
		Random rd=new Random();
		int length=7;
		for(int i=0;i<=length;i++) {
			int randomInt=rd.nextInt(alphNumeric.length());
			char ch=alphNumeric.charAt(randomInt);
			//System.out.print(ch);
			s=s+ch;
		}
		System.out.println(s);
	}

}
