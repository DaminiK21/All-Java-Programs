package JavaPrograms;

public class FibonaciSeries {

	public static void main(String[] args) {
		
		int n1=0,n2=1,n3;
		
		System.out.print(n1+"\t"+n2);
		
		for(int i=2;i<10;++i) {
			n3=n1+n2;
			System.out.print("\t" +n3);
			n1=n2;
			n2=n3;
		}
		
		
		
		

	}

}
