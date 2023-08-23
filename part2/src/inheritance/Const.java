package inheritance;

public class Const {
	int id;
	String name;
	double sal;
	

	public Const(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public String get_details() {
		return this.id+":"+this.name;
	}


	public static void main(String[] args) {
		Const obj=new Const(1,"Rahul", 10000.00);
		System.out.println(obj.get_details());
		System.out.println(obj);

	}

}
