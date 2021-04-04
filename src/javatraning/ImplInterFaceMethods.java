package javatraning;

public class ImplInterFaceMethods implements FirstInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstInterface fi=new ImplInterFaceMethods();
		fi.first();
	}

	@Override
	public void first() {
		// TODO Auto-generated method stub
		System.out.println("I am first method");
	}

	@Override
	public void second() {
		// TODO Auto-generated method stub
		System.out.println("I am second method");
	}

}
