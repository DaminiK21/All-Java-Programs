package JavaPrograms;

public class CheckNumbersEgain {

	public static void main(String[] args) {
		{
			int numCounter = 0;
			String str = "I will eat 2 burgers 23 fries & 1.25 cokes l8r";
			Boolean isPreviousLetterDigit = false;

			for (int i = 0; i < str.length(); i++)

			{

				if (str.charAt(i) != ' ') {
					Boolean isDigit = Character.isDigit(str.charAt(i));

					if (!isDigit) {

						isPreviousLetterDigit = false;
					} else if (!isPreviousLetterDigit) {

						if (isDigit) {
							numCounter++;
							isPreviousLetterDigit = true;
						}
					}
				}
			}
			System.out.println(numCounter);

		}
	}

}
