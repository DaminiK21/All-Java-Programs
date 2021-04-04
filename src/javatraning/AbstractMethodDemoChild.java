package javatraning;

public class AbstractMethodDemoChild extends AbstractClassParent {

	@Override
	public void iamAbstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("here i am child method");
		System.out.println(a);
	}
	public static void main(String[]args) {
		AbstractClassParent parent= new AbstractMethodDemoChild();
		parent.iamAbstractMethod();
		parent.iamNotAbstractMethod();
		AbstractMethodDemoChild child= new AbstractMethodDemoChild();
		child.iamAbstractMethod();
		
	}
	
	

}
