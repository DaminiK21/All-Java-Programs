package javatraning;

public class OverloadingClassProgram {

	
	public void first() {
		System.out.println("i am empty parameter");
	}
	public void first(int a) {
		System.out.println("i am single parameter");
	}
	public void first(int a, int b) {
		System.out.println("i am two parameter");
	}
	public void first(String a) {
		System.out.println("i am single parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingClassProgram ov= new OverloadingClassProgram();
		ov.first();
		ov.first("hello");
	}

}
