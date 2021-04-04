package JavaPrograms;

import java.util.ArrayList;

public class RepeatedCharInStringUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int[2][3];////first is for row and second for column
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=1;
		a[1][0]=6;
		a[1][1]=5;
		a[1][2]=0;
		 int min=a[0][0];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				//System.out.println(a[0][1]);
				if(min>a[i][j])
				{
					min=a[i][j];
				}
				
			}
		}System.out.println(min);
	}
}
