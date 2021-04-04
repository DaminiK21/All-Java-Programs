package JavaPrograms;

public class StrinSequenceChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "Damini Jagannath Kadam";
		String chStr = changeStringseq(st);

		String s1 = "";
		String s2 = "";
		String s3 = "";
		String s4 = "";
		String s5 = "";
		int hasNext = 0;
		int count = 0;
		char[] ch = chStr.toCharArray();

		for (int k = 1; k < chStr.length(); k++) {
			if (ch[k] == ' ') {
				count++;
				if (count == 1) {
					s3 = chStr.substring(0, k);
					s3 = changeStringseq(s3);
					hasNext = k + 1;
				} else {
					s4 = chStr.substring(hasNext, k);

					s4 = changeStringseq(s4);
					hasNext = k + 1;
				}
			}

		}

		s5 = chStr.substring(hasNext, chStr.length());
		s5 = changeStringseq(s5);

		// String rev = s1+""+s2;
		String rev = s3 + "" + s4 + "" + s5;
		System.out.println(rev);
	}

	public static String changeStringseq(String seqChange) {

		String s = " ";
		String str = " ";

		for (int i = seqChange.length() - 1; i >= 0; i--) {
			str = str + seqChange.charAt(i);
		}
		// System.out.println(str);
		return str;

	}

}

/*
 * for (int j = 1; j < chStr.length(); j++) {
 * 
 * if (ch[j] == ' ') { count++; if (count == 1) { s1 = chStr.substring(0, j); s1
 * = changeStringseq(s1); hasNext = j + 1; } else {
 * s2=chStr.substring(hasNext,chStr.length()); s2=changeStringseq(s2); }
 * 
 * }
 * 
 * }
 */
