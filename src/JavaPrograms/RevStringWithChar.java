package JavaPrograms;

public class RevStringWithChar {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String str = "Grass is greener on the other side";
		char[] ch = str.toCharArray();
		int count = 0;
		int nextS = 0;
		String s1 = "";
		String s2 = "";
		String s3 = "";
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == ' ') {
				count++;
				if (count == 1) {
					s1 = str.substring(0, i);
					s1 = revString(s1);
					nextS = i + 1;
				} else {
					s2 = str.substring(nextS, i);
					s2 = revString(s2);
					nextS = i + 1;
				}
			}
		}
		s3 = str.substring(nextS, str.length());

		s3 = revString(s3);
		String rev = s1 + " " + s2 + " " + s3;
		System.out.println(str + " of Reserve each word of String is : " + rev);

	}

	public static String revString(String stringToRev) {
		String revS = "";
		for (int i = stringToRev.length() - 1; i >= 0; i--) {
			revS = revS + stringToRev.charAt(i);
		}
		return revS;
	}

}
