package inheritance;

public class Const2 {
	int id;
	String name;
	double sal;
	

	public Const2(int a, String b, double c) {
		super();
		this.id = a;
		this.name = b;
		this.sal = c;
	}


	public static void main(String[] args) {
		System.out.println(new Const2(1,"Rahul b",100000.00));
		System.out.println(new Const2(1,"Rahul b",100000.00));
	
		

	}

}
