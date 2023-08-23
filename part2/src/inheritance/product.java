package inheritance;

class product {
	String prod_name;
	double prod_price;
	public product(String prod_name, double prod_price) {
		super();
		this.prod_name = prod_name;
		this.prod_price = prod_price;
	}
	

	public static void main(String[] args) {
		product p1=new product("samsung a7",44000.00);
		product p2=new product("samsung a3",89000.00);
		
		System.out.println(p1.prod_name);
		System.out.println(p1.prod_price);
		System.out.println(p2.prod_name);
		System.out.println(p2.prod_price);
		
		
		}




}
