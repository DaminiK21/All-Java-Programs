package JavaPrograms;
import java.lang.String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "madam";

		String temp = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			temp = temp + s.charAt(i);
			System.out.println(temp);
		}
		if(temp.equalsIgnoreCase(s)) {
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

}
