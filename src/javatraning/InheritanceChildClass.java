package javatraning;

public class InheritanceChildClass extends InheritanceParentClass{

	String Color="blue";
	public void color() {
		System.out.println(Color);
	}
	
	public void checkMethod() {
		System.out.println("I am new method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceChildClass child= new InheritanceChildClass();
		child.ghear();;
		InheritanceParentClass parent= new InheritanceParentClass();
		parent.engine();
		child.engine();
		child.checkMethod();
		parent.checkMethod();
		
		InheritanceParentClass pc=new InheritanceChildClass();
		System.out.println(pc.Color);
		pc.checkMethod();
	}

}
