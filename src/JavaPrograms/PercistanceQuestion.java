package JavaPrograms;

public class PercistanceQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		System.out.println("\nNumbers are Divisible By 2 or 3 but not both: ");
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0 && i % 3 != 0) {
				System.out.print(i + ",");
			} else if (i % 3 == 0 && i % 2 != 0) {

				System.out.print(i + ",");

			}

		}

	}
}
