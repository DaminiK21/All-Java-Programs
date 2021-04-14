package javatraning;

public class MethodOverloadingPractice {

	public int addNum(int a) {
		return a * a;
	}

	public int addNum(int a, int b) {
		return a * b + a;
	}

	public String addNum(String a, String b) {
		return a + " " + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingPractice overLoad=new MethodOverloadingPractice();
		System.out.println(overLoad.addNum(2));
		System.out.println(overLoad.addNum(2, 3));
		System.out.println(overLoad.addNum("hi","I am Damini"));
		
	}

}
