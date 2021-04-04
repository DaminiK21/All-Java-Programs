package JavaPrograms;

public class Factorial {

	public static void main(String[] args) {

		int Fact = 1;
		int num = 4;
		for (int i = 1; i <= num; i++) {
			Fact = Fact * i;
			System.out.println(Fact);
		}
		System.out.println(Fact);
	}

}
