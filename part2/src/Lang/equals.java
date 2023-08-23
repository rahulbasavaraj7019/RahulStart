package Lang;

public class equals {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=10;
		equals t1=new equals();
		equals t2=new equals();
		equals t3=t1;
		String s1=new String("Rahul ");
		String s2=new String("Rahul");
		String s3=s1;
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(t1==t2);
		System.out.println(s1==s2);
		System.out.println(t1==t3);
		
		
		
				
	}

}
