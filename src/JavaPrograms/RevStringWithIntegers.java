package JavaPrograms;

import java.util.Arrays;

public class RevStringWithIntegers {

	public static void main(String[] args) {
		String str = "6+2+5";
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		int count=0;
		String s=" ";
		for(int i=0;i<str.length();i++) {
			if(ch[i]=='+') {
				count++;
			}
			
			
		}
		
		for(int j=count;j<str.length();j++) {
			s=s+ch[j]+"+";
				
		}
		
		if (s.endsWith("+")) {

			s = s.substring(0, s.lastIndexOf('+'));

			}
		System.out.println(s);
		}

		}

