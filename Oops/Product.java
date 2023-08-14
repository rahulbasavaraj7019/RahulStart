 Public class Product {
    String mob_Name;
    double mob_Price;
    Product(String name,Double price){
        this.mob_Name=name;
        this.mob_Price=price;
    }
    public static void main(String[] args) {
        Product p1=new Product("Samsung A3",20000.00);
        Product p2=new Product("Samsung A2",23500.00);
        System.out.println("Rahul's phone");
        System.out.println(p1.mob_Name);
        System.out.println(p1.mob_Price);

        System.out.println("Mitul's Phone");
        System.out.println(p2.mob_Name);
        System.out.println(p2.mob_Price);



    }

    
}
