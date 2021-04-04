package JavaPrograms;

public class ReveseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=25872;
		
		int sum=0;
		while(num>0) {
			
				int temp=num % 10;
			sum=(sum*10)+temp;
					
			num=num/10;
		
		}
		if(num==sum)
		{
			System.out.println("reverse number"+ sum);
		}
		
		System.out.println(sum);
	}

}
