package JavaPrograms;
import java.lang.String;


public class PrimeNumber {

	
	public static void main(String[] args){
		
		
		int num=100;
		int j=0;
		String PrimeNumber="";
		for(int i=1;i<=num;i++){
			int count=0;
			for( j=i;j>=1;j--) {
				
				if(i%j==0) {
					count=count+1;
				}
			}
			if(count==2)
			{
				PrimeNumber=PrimeNumber +i+ " ";
			}
			
		}
		System.out.println(PrimeNumber);
	/*	int num=100;
		int j=0;
		String primenumber="";
		for(int i=1;i<=num;i++) {
			int count=0;
			
			for(j=i;j>=1;j--) {
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				primenumber=primenumber +i+ " " ;
				
			}
			
			
		}
		System.out.println(primenumber);
*/
	}

}
