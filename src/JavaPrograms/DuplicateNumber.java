package JavaPrograms;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];

		a[0] = 2;
		a[1] = 3;
		a[2] = 5;
		a[3] = 2;
		a[4] = 5;
		a[5] = 1;
		a[6] = 3;
		a[7] = 1;
		a[8] = 1;
		a[9] = 2;
		int[] b= {2,3,5,7,5,3,6,7,4};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
				
			}
		}

	}

}
