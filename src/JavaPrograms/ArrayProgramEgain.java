package JavaPrograms;

public class ArrayProgramEgain {
	public int processArray() {
		int a[] = { 2, 5, 3, 7, -1 };
		int sum = 0;

		int count=0;
        
		for (int i = 0; i <= a.length-1; i++) {
			if(a[i]>=0) {
			sum = sum + a[i];
			count++;
		}
		}
		return  sum/count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayProgramEgain ag = new ArrayProgramEgain();

		System.out.println(ag.processArray());
	}

}
