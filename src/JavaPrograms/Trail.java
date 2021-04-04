package JavaPrograms;
import java.io.IOException; 
import java.lang.*;

public class Trail {

private static void abs() throws NullPointerException{
		
		System.out.println("trail");
		throw new NullPointerException("Parameter Type cannot be null");
	}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("abc");
			abs();
			System.out.println("pqr");
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		} finally {
			System.out.println("The 'try catch' is finished.");
		}

		System.out.println("i am the last");

	}

}
