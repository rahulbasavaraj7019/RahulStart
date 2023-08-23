package inheritance;
class parent{
	public void m1() {
		System.out.println("Parent class m1 method");
		
	}
	public void m2() {
		System.out.println("Parent class m2 method");
		
	}
}
class child extends parent{
	public void m2() {
		System.out.println("child class m3 mthod");
	}
}

public class Test {
	public static void main(String[] args) {
		parent obj=new child();
		obj.m1();
		obj.m2();
		//obj.m2();
		
	}


}
