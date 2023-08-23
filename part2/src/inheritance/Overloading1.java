package inheritance;


public class Overloading1 {
	public void m1() {
		System.out.println("m1()-zero arguments");
		
		
	}
	public int m1(int a) {
		System.out.println("m1()-Integer arguments");
		return 20;
		}
	public void m1(String s) {
		System.out.println("m1()-String arguments");
		}
	public static void main(String[] args) {
		 Overloading1 obj=new Overloading1();
		 obj.m1();
		 obj.m1(220);
		 obj.m1("Rahul B");
		 
		 
	}
	

	

}
