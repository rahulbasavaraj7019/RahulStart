package Lang;

public class Test {
	public String m1() {
		System.out.println("Test class m1");
		return "hello m1";
	}
	public String tostring() {
		return "Rajinikanth";
	}
	public static void main(String[] args) {
		Test a=new Test();
		System.out.println(a.m1());
		System.out.println(a.tostring());
		System.out.println(a);
		
	}
	

}
