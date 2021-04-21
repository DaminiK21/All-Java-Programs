package collectionsPrograms;

import java.util.ArrayList;

public class ArrayListPropgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("hi");
		al.add("grass");
		al.add("is");
		al.add("green");
		 System.out.println(al);
		 al.remove(0);
		 System.out.println(al);
		 al.remove("is");
		 System.out.println(al);
		
		 System.out.println(al.get(1));
		 
		 
		String a="shriram";
		String b="shri"+"ram";
		String c="shri".concat("ram");
		System.out.println(b);
		System.out.println(c);
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==c);
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(a.equals(c));
	}

}
