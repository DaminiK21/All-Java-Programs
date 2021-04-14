package javatraning;

public class childClassInheritance extends ParentClass {
	
	public void getParentClassMethod() {
		System.out.println("i am child class");
		super.getParentClassMethod();
	}
	
	public childClassInheritance() {
		super();
		System.out.println("I am Child Class Constructor");
		System.out.println(super.color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClassInheritance ch= new childClassInheritance();
		ch.getParentClassMethod();


	}
}
