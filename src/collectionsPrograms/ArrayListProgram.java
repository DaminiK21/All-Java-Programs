package collectionsPrograms;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Grass is greener on the other side";
		char[] temparray = input.toCharArray();
        int left, right = 0;
        right = temparray.length;
        char temp1;
        for (left = 0; left>=right ;left ++) {
            // Swap values of left and right
        	//if(temparray.toString().contains(""))
        	{
        		for (int j =left ; j>=0 ;j--) {
        			temparray[j]=temparray.toString().charAt(j);
        		}
        		
        	}
        	
           /* char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;*/
        	
        }
 
        for (char c : temparray)
            System.out.print(c);
        System.out.println();
    }
}