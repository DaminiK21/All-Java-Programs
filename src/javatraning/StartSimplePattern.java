package javatraning;

public class StartSimplePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * 
		 * *
		 * * *
		 * * * *
		 * * * * *
		 */
//i is for Column
		//J for row
		
		  for(int i=0;i<=4;i++) { for(int j=0;j<=i;j++) { System.out.print("*"); }
		  System.out.println(" "); }
		  
		  for(int i=0;i<=4;i++) { for(int j=4;j>i;j--) { System.out.print("*"); }
		  System.out.println(); }
		  
		  
		  System.out.println("-----------------------");
		 
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
		
			}
			
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
		
			}
			
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
	}

}
