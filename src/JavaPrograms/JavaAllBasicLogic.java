package JavaPrograms;

public class JavaAllBasicLogic {

	public static String revString(String rev) {
		String revStr = "";
		for (int i = rev.length() - 1; i >= 0; i--) {
			revStr = revStr + rev.charAt(i);

		}
		return revStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Grass is greener on the other side";
		String s1 = "";
		String s2 = "";
		String s3 = "";

		int count = 0;
		int hasnext = 0;
		char[] ch = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (ch[i] == ' ' || ch[i]==s.length()) {
				count++;
				if (count>= 1) {
					s1 = s.substring(hasnext, i);
					s1 = revString(s1);
					hasnext = i + 1;
					s2=s2+s1+" ";
				} 
			}

		}
		s3 = s.substring(hasnext, s.length());
		s3 = revString(s3);
		
		String rev= s2 + " " + s3;
		System.out.println(rev);

	}

}
