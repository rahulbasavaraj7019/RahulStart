package Langpack;

public class Autobox2 {
	public static void main(String[]args) {
	double a=450000.00;
	Double b=a;
	Double c=Double.valueOf(a);
	double salary=b;
	double s=b.doubleValue();
	System.out.println(a);
	System.out.println(b.toString());
	System.out.println(c);
	System.out.println(salary);
	System.out.println(s);
	}
	
}
