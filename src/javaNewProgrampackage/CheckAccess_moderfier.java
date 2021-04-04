package javaNewProgrampackage;

public class CheckAccess_moderfier {

	int i=8;
	private int j=21;
	protected void accessmedthos() {
		System.out.println("I can access outside the package and class but with child class only");
	}
	
	 void defaultmethos() {
		System.out.println("I can't access outside the class but within package");
	}
	 
	 private void privateMethos() {
		 System.out.println("I can access within class");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		
	}

}
